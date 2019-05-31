package com.jdwill;

public class Application {
	
	public static void main(String[] args) {
		int firstOperand = 5;
		int secondOperand = 5;
		Operator operation = Operator.DIVIDE;
		
		Calculator calculator = new Calculator();
		int result = calculator.calculateUsingFactory(firstOperand, secondOperand, operation);
		System.out.println(firstOperand + " " + operation.getSymbol() + " " + secondOperand + " = " +  result);
	}

}
