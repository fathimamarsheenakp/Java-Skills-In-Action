package com.kodnest.unittesting.testsuits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	void testDivivde() {
		assertEquals(2.5, Calculator.divide(5, 2), 0.0001); 
        assertEquals(-2.5, Calculator.divide(-5, 2), 0.0001);
	}
	
	@Test
	public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(5, 0); 
        });
        assertEquals("Denominator cannot be zero", exception.getMessage());
    }

}
