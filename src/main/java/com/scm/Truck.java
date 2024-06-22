package com.scm;

public class Truck implements Vehicle{
    private final String brand;
    private final String truckNumber;

    private DrivingStrategy drivingStrategy;

    Truck(String brand,String truckNumber){
        this.brand = brand;
        this.truckNumber = truckNumber;
    }
    @Override
    public void drive() {
        drivingStrategy.drive();
    }

    @Override
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
}
