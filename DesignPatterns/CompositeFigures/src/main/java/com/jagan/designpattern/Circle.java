package com.jagan.designpattern;

public class Circle extends BasicFigure {

	public Circle(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("Drawing Circle with color :" + this.color);
	}

	public String getFilledColor() {
		return this.color;
	}

}
