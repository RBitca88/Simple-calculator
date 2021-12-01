package com.step;

import com.step.operations.Calculator;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
        calculator.add(25, 4);
        calculator.minus(25, 4);
        calculator.multiply(25, 4);
        calculator.divide(25, 4);
    }
}
