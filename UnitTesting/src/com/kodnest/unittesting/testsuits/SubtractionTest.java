package com.kodnest.unittesting.testsuits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionTest {

	@Test
	void testSubtract() {
		assertEquals(1, Calculator.subtract(3, 2)); // 3 - 2 = 1
        assertEquals(1, Calculator.subtract(-2, -3)); 
	}

}
