package com.kodnest.unittesting.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateDiscountTest {

	@Test
	void test() {
		assertEquals(4050.0, CalculateDiscount.calculateDiscountedPrice(4500), 0.01);
	}

}
