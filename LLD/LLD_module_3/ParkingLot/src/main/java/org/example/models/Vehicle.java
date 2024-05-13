package org.example.models;

public class Vehicle extends BaseModel {
//    private int Wheelers;
    private VehicleType vehicleType;
    private String vehicleNumber;
    private String ownerName;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

//    public int getWheelers() {
//        return Wheelers;
//    }
//
//    public void setWheelers(int wheelers) {
//        Wheelers = wheelers;
//    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
