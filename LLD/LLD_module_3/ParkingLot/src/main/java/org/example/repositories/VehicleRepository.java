package org.example.repositories;

import org.example.models.Vehicle;

import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    private HashMap<String, Vehicle> vehiclesRepo = new HashMap<>();
    public Optional<Vehicle> findVehicleByNumber(String number) {
        //find vehicle by id
        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
       vehiclesRepo.put(vehicle.getVehicleNumber(), vehicle);
        return vehicle;
    }
}