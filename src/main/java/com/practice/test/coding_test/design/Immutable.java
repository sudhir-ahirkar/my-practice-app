package com.practice.test.coding_test.design;


// how to create your immutable class
public final class Immutable {

    // Final Variable is must
    private final String name;

    // Initialise final properties in constructor only while creating object
    public Immutable(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    // we cannot again reassign value to final variable
/*    public void setName(String name){
        this.name=name;
    }*/


}
