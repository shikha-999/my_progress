package org.example.repositories;

import org.example.models.Gate;
import org.example.models.ParkingLot;
import org.example.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
   //find gate by gateId
    private Map<Long, Gate> gateRepo = new HashMap<>();

    public Optional<Gate> findByGateId(Long gateId) {
        if(gateRepo.containsKey(gateId)) {
            return Optional.of(gateRepo.get(gateId));
        }
        return Optional.empty();
    }
}