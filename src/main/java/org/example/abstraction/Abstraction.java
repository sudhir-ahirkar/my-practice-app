package org.example.abstraction;

    // Vehicle interface
    interface Vehicle {
        void start();
        void stop();
    }

    // Car class implementing Vehicle interface
    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car started. Ignition initiated.");
        }

        @Override
        public void stop() {
            System.out.println("Car stopped. Engine turned off.");
        }
    }

    // Bicycle class implementing Vehicle interface
    class Bicycle implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bicycle started. Start pedaling.");
        }

        @Override
        public void stop() {
            System.out.println("Bicycle stopped. Stop pedaling.");
        }
    }

public class Abstraction {
    public static void main(String[] args) {
        // Create instances of Car and Bicycle
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Use the vehicles
        car.start();
        car.stop();

        System.out.println();

        bicycle.start();
        bicycle.stop();
    }
}
