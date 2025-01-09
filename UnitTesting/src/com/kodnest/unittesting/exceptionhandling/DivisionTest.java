package com.kodnest.unittesting.exceptionhandling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void testDivideByZero() {
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			Division.divide(10, 0);
		});
		
		assertEquals("Denominator cannot be zero", e.getMessage());
	}

	void testValidDivision() {
		assertEquals(5, Division.divide(10, 2));
	}
}
