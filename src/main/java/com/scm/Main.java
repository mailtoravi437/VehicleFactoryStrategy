package com.scm;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Hyundai","12345");
        car.setDrivingStrategy(new CarDrivingStrategy());
        car.drive();
    }
}