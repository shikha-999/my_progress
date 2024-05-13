package org.example.strategies;

import org.example.models.ParkingSpot;
import org.example.models.ParkingSpotStatus;
import org.example.models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{
    private List<ParkingSpot> parkingSpots;

    public ParkingSpot getSpot(VehicleType vehicleType) {
        //logic to find random spot
        //loop around to save available empty spots and return random spot
        List<ParkingSpot> vacantSpots = new ArrayList<>();
        for(ParkingSpot spots : parkingSpots){
            if(spots.getParkingSpotStatus() == ParkingSpotStatus.VACANT){
                vacantSpots.add(spots);
            }
        }
        if(!vacantSpots.isEmpty()){
            int randomSpot = (int) Math.random() * vacantSpots.size();
            return vacantSpots.get(randomSpot);
        }
        return null;
    }
}
