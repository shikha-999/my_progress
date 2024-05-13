package org.example;

import org.example.controllers.TicketController;
import org.example.repositories.GateRepository;
import org.example.repositories.ParkingLotRepository;
import org.example.repositories.TicketRepository;
import org.example.repositories.VehicleRepository;
import org.example.service.TicketService;

public class Main {
    public static void main(String[] args) {
        //creation of object matters
        //because controller needs service, service needs repositories
        //create repositories, then service, then controller
        //topological sort the dependencies

        //repositories
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        //service
        TicketService ticketService = new TicketService(gateRepository, vehicleRepository, parkingLotRepository, ticketRepository);

        //controller
        TicketController ticketController = new TicketController(ticketService);
    }
}