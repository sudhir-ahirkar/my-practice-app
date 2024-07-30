package org.example;

public class Car {
    String brand;
    int seatingCapacity;
    String enginType;
    public Car(){
        System.out.println("Constructor called and Car Object created");
    }
    public Car(String brand, int seatingCapacity, String enginType) {
        this.brand=brand;
        this.seatingCapacity=seatingCapacity;
        this.enginType=enginType;
    }



/*    void setCarDetails(String brand,int seatingCapacity,String enginType){
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
        this.enginType = enginType;
    }*/

    void printCarDetails(){
        System.out.println("Car brand is: "+this.brand+ ", seating capacity: "+this.seatingCapacity+" and engineType is "+this.enginType);
    }

    void startEngine(){
        System.out.println("Car "+this.brand+" has been started");
    }

    public static void main(String[] args) {

        Car tataNano = new Car();
        tataNano.brand = "nano";
        tataNano.seatingCapacity = 4;
        tataNano.enginType = "Petrol";
        tataNano.printCarDetails();
        tataNano.startEngine();;

        System.out.println("====================================");

        Car tataNano2 = new Car("Balano",4,"Petrol");
        tataNano2.printCarDetails();
        tataNano2.startEngine();;

    }


    // constructor rule
      /*
        - Kind of special type of constructor
      * - void
      * - Constructor created by using Class name
      * - Parameter and not Parameter constructor
        - Constructor called single time only at the time object construct/creations
      * */

    // explain how constructor get called, explain with debug
    // also explain by default constructor

    // above things in ppt with animation
}
