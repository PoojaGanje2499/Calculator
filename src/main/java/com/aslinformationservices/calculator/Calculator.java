package com.aslinformationservices.calculator;

public class Calculator {

	public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    }
}