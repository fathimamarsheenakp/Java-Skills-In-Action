package com.kodnest.unittesting.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c = new Calculator();
	@Test
	void add() {
		int output = c.add(5, 3);
		assertEquals(8, output);
	}

	@Test
	void sub() {
		int output = c.sub(5, 3);
		assertEquals(2, output);
	}
	
	@Test
	void subNegative() {
	    int output = c.sub(-5, 3);  // Testing negative subtraction
	    assertEquals(-8, output);  // Expected result: -5 - 3 = -8
	}
	
	
}
