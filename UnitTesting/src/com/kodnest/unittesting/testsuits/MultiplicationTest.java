package com.kodnest.unittesting.testsuits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

	@Test
	void testMultiply() {
		assertEquals(6, Calculator.multiply(2, 3)); // 2 * 3 = 6
        assertEquals(-6, Calculator.multiply(-2, 3));
	}

}
