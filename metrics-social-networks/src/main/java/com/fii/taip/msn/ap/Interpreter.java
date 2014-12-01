// interpreter pattern

package com.fii.taip.msn.ap;

public class Interpreter {

	PositiveExpression positiveExpression;
	NegativeExpression negativeExpression;

	public Interpreter() {
		positiveExpression = new PositiveExpression();
		negativeExpression = new NegativeExpression();
	}

	public PositiveExpression getPositiveExpression() {
		return positiveExpression;
	}

	public NegativeExpression getNegativeExpression() {
		return negativeExpression;
	}

}
