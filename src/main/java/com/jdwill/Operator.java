package com.jdwill;

public enum Operator {
	
	ADD {
		public String getSymbol() {
			return "+";
		}
	},
	SUBSTRACT {
		public String getSymbol() {
			return "-";
		}
	},
	MULTIPLY {
		public String getSymbol() {
			return "*";
		}
	},
	DIVIDE {
		public String getSymbol() {
			return "/";
		}
	},
	MODULUS {
		public String getSymbol() {
			return "%";
		}
	};
	
	public abstract String getSymbol();

}
