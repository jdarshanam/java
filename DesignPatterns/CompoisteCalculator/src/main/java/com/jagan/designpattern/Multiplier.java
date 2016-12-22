package com.jagan.designpattern;

public class Multiplier extends BinaryExpression {

	public Multiplier(Expression left, Expression right) {
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue() * this.right.getValue();
	}

}
