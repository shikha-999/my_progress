package org.example.repositories;

import org.example.models.Gate;
import org.example.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotRepo = new HashMap<>();
    public ParkingLot getParkingLotByGate(Gate gate) {
        //parkingLot has gate
        //so go through all ParkingLot and find Gate based on GateID
        for(ParkingLot parkingLot : parkingLotRepo.values()){
            if(parkingLot.getGates().contains(gate)){
                return parkingLot;
            }
        }
        return null;
    }
}
