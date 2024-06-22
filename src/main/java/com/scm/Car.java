package com.scm;

public class Car implements Vehicle{
    private final String brand;
    private final String carNumber;
    private DrivingStrategy drivingStrategy;

    Car(String brand,String carNumber){
        this.brand = brand;
        this.carNumber = carNumber;
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
