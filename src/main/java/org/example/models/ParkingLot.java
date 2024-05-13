package org.example.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    private String address;
    private List<Gate> gates;
    private List<ParkingFloor> parkingFloors;
    private ParkingLotStatus parkingLotStatus;
    private FeeCalculationStrategyType feeCalculationStrategyType;
    private SpotCalculationStrategyType spotCalculationStrategyType;
    //private List<AllowedVehicle> allowedVehicles;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public FeeCalculationStrategyType getFeeCalculationStrategyType() {
        return feeCalculationStrategyType;
    }

    public void setFeeCalculationStrategyType(FeeCalculationStrategyType feeCalculationStrategyType) {
        this.feeCalculationStrategyType = feeCalculationStrategyType;
    }

    public SpotCalculationStrategyType getSpotCalculationStrategyType() {
        return spotCalculationStrategyType;
    }

    public void setSpotCalculationStrategyType(SpotCalculationStrategyType spotCalculationStrategyType) {
        this.spotCalculationStrategyType = spotCalculationStrategyType;
    }
}

