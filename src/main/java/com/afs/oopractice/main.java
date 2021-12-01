package com.afs.oopractice;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {
        Car car = new Car("car",30);
        Truck truck = new Truck("truck",10);
        car.speedUp();
        truck.speedUp();

        Driver carDriver = new Driver(car);
        carDriver.speedUp();
        Driver truckDriver = new Driver(car);
        truckDriver.speedUp();

//        gasolineEngine
//        Engine engine = new Engine();
    }


}

