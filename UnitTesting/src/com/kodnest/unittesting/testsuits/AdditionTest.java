package com.kodnest.unittesting.testsuits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void testAdd() {
		assertEquals(5, Calculator.add(2, 3));
		assertEquals(-5, Calculator.add(-2, -3));
	}

}
