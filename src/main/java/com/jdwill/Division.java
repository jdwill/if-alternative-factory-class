package com.jdwill;

public class Division implements Operation {

	@Override
	public int apply(int dividend, int divisor) {
		return dividend / divisor;
	}

}
