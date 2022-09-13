package com.maxbarr.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.setOperandOne(10.5);
		cal.setOperation("+");
		cal.setOperandTwo(5.2);
		cal.performOperation();
		cal.getResults();
		
		cal.setOperandOne(23.5);
		cal.setOperation("-");
		cal.setOperandTwo(13.8);
		cal.performOperation();
		cal.getResults();
		
		cal.setOperandOne(13.1);
		cal.setOperandTwo(2.5);
		cal.setOperation("*");
		cal.performOperation();
		cal.getResults();
		
		cal.setOperandOne(10.0);
		cal.setOperandTwo(3.4);
		cal.setOperation("/");
		cal.performOperation();
		cal.getResults();
	}

}
