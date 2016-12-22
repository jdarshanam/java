package com.jagan.designpattern;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jagan.designpattern.Circle;
import com.jagan.designpattern.Figure;
import com.jagan.designpattern.Square;

public class FiguresTest {

	@Test
	public void testDrawCircle() {
		String color = "red";
		Figure f = new Circle(color);
		f.draw();
		assertEquals(color, f.getFilledColor());
	}

	@Test
	public void testDrawSquare() {
		String color = "blue";
		Figure f = new Square(color);
		f.draw();
		assertEquals(color, f.getFilledColor());
	}
}
