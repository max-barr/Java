
class Calculator implements java.io.Serializable {
	private double operandOne = 0.0;
	private double operandTwo = 0.0;
	private String operation = "";
	
//	Constructors
	public Calculator() {
	}
	public Calculator(double operandOne, double operandTwo) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
	}
	
//	Getters
	public double getOperandOne() {
		return operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public String getOperation() {
		return operation;
	}
//	Setters
	public double setOperandOne(double number) {
		operandOne = number;
		return getOperandOne();
	}
	public double setOperandTwo(double number) {
		operandTwo = number;
		return getOperandTwo();
	}
	public String setOperation(String operation) {
		this.operation = operation;
		return getOperation();
	}
	
//	Perform operation
	public double performOperation() {
		if (this.operation == "+") {
			return getOperandOne() + getOperandTwo();
		} else if (this.operation == "-") {
			return getOperandOne() - getOperandTwo();
		} else return 0.0;
	}
	
//	Get results
	public double getResults() {
		double results = performOperation();
		System.out.println(results);
		return results;
	}
}
