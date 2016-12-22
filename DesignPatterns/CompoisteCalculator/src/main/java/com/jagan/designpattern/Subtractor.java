package com.jagan.designpattern;

public class Subtractor extends BinaryExpression {


	public Subtractor(Expression left, Expression right) {
		super(left, right);
	}

	public double getValue() {
		return this.left.getValue() - this.right.getValue();
	}

}
