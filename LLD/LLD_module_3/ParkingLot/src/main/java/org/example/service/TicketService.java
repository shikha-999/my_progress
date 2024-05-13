package org.example.service;

import org.example.exceptions.GateNotFoundException;
import org.example.models.*;
import org.example.repositories.GateRepository;
import org.example.repositories.ParkingLotRepository;
import org.example.repositories.TicketRepository;
import org.example.repositories.VehicleRepository;
import org.example.strategies.SpotAssignmentStrategy;
import org.example.strategies.SpotAssignmentStrategyFactory;
import java.util.Date;
import java.util.Optional;

//services - chef
//multiple waiters(services) can go to 1 chef
//services SHOULD be GENERIC, not specific to 1 controller
//hence, services DO NOT take DTOs as input
//dependency injection at start of program (from main class)
public class TicketService {
    //Ticket object is not exposed to outside world, because it's going to Controller
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    //constructor
    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(
                                VehicleType vehicleType,
                                String vehicleNumber,
                                String vehicleOwnerName,
                                Long gateId
    ) throws GateNotFoundException {
        //business logic
        /*
        1. create ticket
        2. assign entry time
        3. assign gate from repository through gateId
        4. Assign vehicle from DB (pre-existing/non-existing) to ticket
        5. assign parking spot
        6. assign number
        7. return ticket
        * */

        //1.
        Ticket ticket = new Ticket();
        //2.
        ticket.setEntryTime(new Date());

        //3. we can only set Gate, but we have gateID, so get the Gate object from DB(repository) and set it
        Optional<Gate> gateOptional = gateRepository.findByGateId(gateId);
        if(gateOptional.isEmpty()){
            //throw custom exception
            throw new GateNotFoundException("Gate not found with id: " + gateId);
        }
        Gate gate = gateOptional.get();
        ticket.setGate(gate);
        ticket.setGeneratedBy(gate.getOperator());

        //4.
        //check if vehicle is already present in the DB
        //YES - get the vehicle from DB, put it in ticket object
        //NO - create a new vehicle object, put it in DB, put it in ticket object
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle savedVehicle;
        if(vehicleOptional.isEmpty()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }else{
            savedVehicle = vehicleOptional.get();
        }
        ticket.setVehicle(savedVehicle);

        //5. assign parking spot
        //parkingLotRepository.getParkingLotByGate(gate) gives ParkingLot object ---> wow!!
        SpotCalculationStrategyType spotCalculationStrategyType = parkingLotRepository.getParkingLotByGate(gate).getSpotCalculationStrategyType();
        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotforType(spotCalculationStrategyType);
        ticket.setParkingSpot(spotAssignmentStrategy.getSpot(vehicleType));

        //6. create ticket number
        //getId() is from BaseModel
        Ticket savedTicket = ticketRepository.saveTicket(ticket);
        ticket.setTicketNumber("TICKET - " + savedTicket.getId());

        return ticket;

    }
}