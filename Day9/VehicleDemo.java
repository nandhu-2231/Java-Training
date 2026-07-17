package Day9;
// VehicleDemo.java

class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key.");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with self-start.");
    }
}

class Bus extends Vehicle {
    void start() {
        System.out.println("Bus starts with ignition.");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Bus();

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}