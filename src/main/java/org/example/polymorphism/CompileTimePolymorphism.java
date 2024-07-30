package org.example.polymorphism;


 class Calculator {
    // Method with the same name but different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    // Method with the same name but different number of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with the same name but different parameter types
    public double add(double a, double b) {
        return a + b;
    }

}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Testing the overloaded add methods
        System.out.println("Adding two integers: " + calculator.add(5, 3));
        System.out.println("Adding three integers: " + calculator.add(5, 3, 2));
        System.out.println("Adding two doubles: " + calculator.add(3.5, 2.5));
    }
}
