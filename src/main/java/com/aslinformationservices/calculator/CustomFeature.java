package com.aslinformationservices.calculator;

public class CustomFeature {

    public double calculateMean(double... numbers) {
    	  if (numbers.length == 0) {
              System.out.println("Error: Cannot calculate mean for an empty set of numbers");
              return Double.NaN; // NaN (Not a Number) represents an undefined result
          }

          double sum = 0;

          for (double number : numbers) {
              sum += number;
          }

          return sum / numbers.length;
      
    }
}