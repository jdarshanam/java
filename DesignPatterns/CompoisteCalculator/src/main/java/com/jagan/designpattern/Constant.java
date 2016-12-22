package com.jagan.designpattern;

public class Constant implements Expression {

	private Double value;

	public Constant(Double value) {
		this.value = value;
	}

	public double getValue() {
		return this.value;
	}

}
