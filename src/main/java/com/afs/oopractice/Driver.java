package com.afs.oopractice;

public class Driver {

    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void speedUp() {
        this.vehicle.speedUp();
    }
}
