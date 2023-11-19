package com.aslinformationservices.calculator;

public class EquationSolver {

    public double solveLinearEquation(double a, double b, double c) {
    	  // Check if the equation is linear (a cannot be zero for a linear equation)
        if (a != 0) {
            // Solve the linear equation ax + b = c for x
            double x = (c - b) / a;
            return x;
        } else {
            System.out.println("Error: The equation is not linear (a cannot be zero)");
            return Double.NaN; // NaN (Not a Number) represents an undefined result
        }
    
    }
}