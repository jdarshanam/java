package com.jagan.designpattern;

public class Square extends BasicFigure {

	public Square(String color) {
		super(color);
	}

	public void draw() {
		System.out.println("Drawing Square with color : " + this.color);
	}

	public String getFilledColor() {
		return this.color;
	}

}
