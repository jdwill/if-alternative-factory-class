package com.jdwill;

import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class OperatorFactory {
	
	static Map<Operator, Operation> operationMap = new EnumMap<>(Operator.class);
	
	static {
		operationMap.put(Operator.ADD, new Addition());
		operationMap.put(Operator.DIVIDE, new Division());
	}
	
	public static Optional<Operation> getOperation(Operator operator) {
		return Optional.ofNullable(operationMap.get(operator));
	}

}
