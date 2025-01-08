package com.kodnest.unittesting.beforenafter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator c;
	
	@BeforeAll
    static void beforeAllTests() {
        System.out.println("Setting up shared resources before all tests...");
        // Example: Initialize a database connection or a server
    }
	
	@BeforeEach
    void setUp() {
        System.out.println("Initializing Calculator before each test...");
        c = new Calculator(); // Initialize Calculator before each test
    }
	
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
	
	@AfterEach
    void tearDown() {
        System.out.println("Cleaning up after each test...");
        c = null; // Reset calculator after each test
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Cleaning up shared resources after all tests...");
        // Example: Close the database connection or stop the server
    }
	
	
}
