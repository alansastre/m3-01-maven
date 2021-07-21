package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	void testSum() throws Exception {
		assertEquals(4, calc.sum(2, 2));
	}
	
	
	@Test
	void testSum2() throws Exception {
		assertEquals(0, calc.sum(-2, 2));
	}
	
	@Test
	void testMult() throws Exception {
		assertEquals(0, calc.mult(0, 0));
	}
}
