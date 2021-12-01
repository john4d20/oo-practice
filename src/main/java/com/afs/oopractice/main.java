package com.afs.oopractice;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        Car car = new Car("car",30);
        Truck truck = new Truck("truck",10);
        car.speedUp();
        truck.speedUp();
//        Vehicle vehicle = new Vehicle("car")
//        Driver driver = new Driver("car");
    }


}

