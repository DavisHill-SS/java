package com.part4;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.part4.Calculator;

public class CalculatorTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void additionTest() {
		assertEquals(new Integer(4), calc.addition(2, 2));
		assertNotEquals(new Integer(4), calc.addition(3, 2));
	}
	
	@Test
	public void subTest() {
		assertEquals(new Integer(0), calc.sub(2, 2));
	}

}
