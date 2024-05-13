package org.example.strategies;

import org.example.models.ParkingSpot;
import org.example.models.ParkingSpotStatus;
import org.example.models.VehicleType;

import java.util.List;

public class NearbySpotAssignmentStrategy implements SpotAssignmentStrategy{
    private List<ParkingSpot> parkingSpots;

    public ParkingSpot getSpot(VehicleType vehicleType) {
        if(!parkingSpots.isEmpty()){
            return getFirstAvailableSpot();
        }
        return null;
    }

    public ParkingSpot getFirstAvailableSpot(){
        for(ParkingSpot spots : parkingSpots)
            if(spots.getParkingSpotStatus() == ParkingSpotStatus.VACANT)
                return spots;
        return null;
    }
}
