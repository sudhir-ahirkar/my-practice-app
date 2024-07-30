package org.example.inheritance;

    // Parent class
    class Vehicle {
        private String brand;
        private String model;
        private int year;

        public Vehicle(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public void drive() {
            System.out.println("Vehicle is being driven.");
        }
    }

    // Child class Car inheriting from Vehicle
    class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, String model, int year, int numberOfDoors) {
            super(brand, model, year);
            this.numberOfDoors = numberOfDoors;
        }

        public int getNumberOfDoors() {
            return numberOfDoors;
        }

        @Override
        public void drive() {
            System.out.println("Car is being driven.");
        }
    }

    // Child class Bicycle inheriting from Vehicle
    class Bicycle extends Vehicle {
        private int numberOfGears;

        public Bicycle(String brand, String model, int year, int numberOfGears) {
            super(brand, model, year);
            this.numberOfGears = numberOfGears;
        }

        public int getNumberOfGears() {
            return numberOfGears;
        }

        @Override
        public void drive() {
            System.out.println("Bicycle is being ridden.");
        }
    }

public class Inheritance {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Bicycle bicycle = new Bicycle("Giant", "Escape", 2021, 21);

        // Print vehicle details and behavior
        System.out.println("Car:");
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());
        car.drive(); // Override behavior for Car

        System.out.println();

        System.out.println("Bicycle:");
        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Year: " + bicycle.getYear());
        System.out.println("Number of Gears: " + bicycle.getNumberOfGears());
        bicycle.drive(); // Override behavior for Bicycle
    }
}



