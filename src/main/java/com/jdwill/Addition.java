package com.jdwill;

public class Addition implements Operation {

	@Override
	public int apply(int firstAddend, int secondAddend) {
		return firstAddend + secondAddend;
	}

}
