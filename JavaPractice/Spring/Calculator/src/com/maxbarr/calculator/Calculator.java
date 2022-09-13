package com.maxbarr.calculator;

public class Calculator {
//	Class attributes
	private double operandOne;
	private double operandTwo;
	private String operation = "";
	
	//	Constructors
	public Calculator(double operandOne, double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
	}
	public Calculator() {}
	
//	Getters and setters
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
//	Class methods
	public double performOperation() {
		if (getOperation() == "+") {
			return getOperandOne() + getOperandTwo();
		} else if (getOperation() == "-") {
			return getOperandOne() - getOperandTwo();
		} else if (getOperation() == "*") {
			return getOperandOne() * getOperandTwo();
		} else if (getOperation() == "/") {
			return getOperandOne() / getOperandTwo();
		} else {
			return 0.0;
		}
	}
	
	public double getResults() {
		double results = performOperation();
		System.out.println(results);
		return results;
	}
	
	
	

	
	
}
