package com.simplilearn.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {

	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator=new Calculator();
	}
	
	@Test
	@DisplayName("Test Addition : positive numbers")
	@RepeatedTest(3)
	public void testAdd() {
		double result = calculator.add(1000, 500);
		double excpected = 1500.0;
		Assertions.assertEquals(excpected, result, "1000+ 500 should be equal to 1500.");
	}
	
	@Test
	@DisplayName("Test Substraction : positive numbers")
	@RepeatedTest(value=4, name="{displayName} - repetition {currentRepetition} of {totalRepetitions}")
	public void testSub() {
		double result = calculator.sub(1000, 500);
		double excpected = 500.0;
		Assertions.assertEquals(excpected, result, "1000-500 should be equal to 500.");
	}
	
	
	@Test
	@DisplayName("Test Substraction : positive numbers")
	@RepeatedTest(value=4, name = RepeatedTest.LONG_DISPLAY_NAME )
	public void testSub2() {
		double result = calculator.sub(1000, 500);
		double excpected = 500.0;
		Assertions.assertEquals(excpected, result, "1000-500 should be equal to 500.");
	}
	
	
	@Test
	@DisplayName("Test Substraction : positive numbers")
	@RepeatedTest(value=4, name = RepeatedTest.SHORT_DISPLAY_NAME )
	public void testSub3() {
		double result = calculator.sub(1000, 500);
		double excpected = 500.0;
		Assertions.assertEquals(excpected, result, "1000-500 should be equal to 500.");
	}
}


