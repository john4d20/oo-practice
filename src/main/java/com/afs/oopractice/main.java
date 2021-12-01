package com.afs.oopractice;


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
        Car electricCar = new Car("car",new electricEngine());
        Car gasolineCar = new Car("truck",new gasolineEngine());
        electricCar.speedUp();
        gasolineCar.speedUp();
    }
}

