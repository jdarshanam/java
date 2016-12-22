package com.jagan.designpattern;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jagan.designpattern.Adder;
import com.jagan.designpattern.Constant;
import com.jagan.designpattern.Divider;
import com.jagan.designpattern.Expression;
import com.jagan.designpattern.Multiplier;
import com.jagan.designpattern.Subtractor;

public class CompositeTest {

	@Test
	public void testConstant() {
		Double testValue = 3.0;
		Expression e = new Constant(testValue);
		assertEquals(testValue, e.getValue(), 0.0);
	}

	@Test
	public void testAdder() {
		Double leftValue = 3.0;
		Double rightValue = 4.0;

		Expression left = new Constant(leftValue);
		Expression right = new Constant(rightValue);

		Expression e = new Adder(left, right);

		assertEquals(leftValue + rightValue, e.getValue(), 0.0);
	}

	@Test
	public void testSubtractor() {

		Double leftValue = 4.0;
		Double rightValue = 3.0;

		Expression left = new Constant(leftValue);
		Expression right = new Constant(rightValue);

		Expression e = new Subtractor(left, right);
		assertEquals(leftValue - rightValue, e.getValue(), 0.0);
	}

	@Test
	public void testMultiplier() {

		Double leftValue = 4.0;
		Double rightValue = 3.0;

		Expression left = new Constant(leftValue);
		Expression right = new Constant(rightValue);

		Expression e = new Multiplier(left, right);
		assertEquals(leftValue * rightValue, e.getValue(), 0.0);
	}

	@Test
	public void testDivider() {

		Double leftValue = 4.0;
		Double rightValue = 3.0;

		Expression left = new Constant(leftValue);
		Expression right = new Constant(rightValue);

		Expression e = new Divider(left, right);
		assertEquals(leftValue / rightValue, e.getValue(), 0.0);
	}

	/*
	 * (3+5)*100/(2+64)
	 */
	@Test
	public void testComplexExpression() {
		Expression e = new Divider(new Multiplier(new Adder(
				new Constant(3.0), new Constant(5.0)), new Constant(100.0)),
				new Adder(new Constant(2.0), new Constant(64.0)));
		assertEquals(12.12121212, e.getValue(),0.0001);

	}
}
