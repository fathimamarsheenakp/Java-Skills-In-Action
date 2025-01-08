package com.kodnest.unittesting.parameterized;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.ParameterizedTest;
class CalculatorTest {

	Calculator calculator = new Calculator();
	
	 @ParameterizedTest
	 @CsvSource({
		 "2, 3, 5",
		 "10, 20, 30",
		 "-5, 5, 0",
		 "0, 0, 0"
		 })
	 void testAdd(int a, int b, int expectedResult) {
		 System.out.println("Testing add method with inputs: " + a + ", " + b);
		 int result = calculator.add(a, b);
		 assertEquals(expectedResult, result, "The add method failed!");
		 }
	 
	 @ParameterizedTest
	 @CsvSource({
		 "5, 3, 2",
		 "20, 10, 10",
		 "0, 5, -5",
		 "-5, -5, 0"
	 })
	 
	 void testSub(int a, int b, int output) {
		 System.out.println("Testing sub method with inputs: " + a + ", " + b);
		 int result = calculator.sub(a, b);
		 assertEquals(output, result, "The sub method failed!");
	 }

}
