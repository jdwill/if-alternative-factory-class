package com.jdwill;

public class Calculator {
	
	public int calculateUsingFactory(int firstOperand, int secondOperand, Operator operation) {
			Operation targetOperation = OperatorFactory.getOperation(operation)
					.orElseThrow(() -> new IllegalArgumentException("Invalid Operator"));
			return targetOperation.apply(firstOperand, secondOperand);
	}

}
