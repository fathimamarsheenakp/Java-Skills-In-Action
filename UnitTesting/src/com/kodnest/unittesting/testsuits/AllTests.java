package com.kodnest.unittesting.testsuits;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AdditionTest.class, DivisionTest.class, MultiplicationTest.class, SubtractionTest.class })
public class AllTests {
    // This suite will run all the tests from AdditionTest, SubtractionTest, MultiplicationTest, and DivisionTest
}
