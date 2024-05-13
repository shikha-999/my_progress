package org.example.strategies;

import org.example.models.ParkingSpot;
import org.example.models.VehicleType;

//strategy to find where vehicle needs to get parked
public interface SpotAssignmentStrategy{
    public ParkingSpot getSpot(VehicleType vehicleType);
}
