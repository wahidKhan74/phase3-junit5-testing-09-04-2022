package com.simplilearn.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Arithmetic Calculator Test")
public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		calculator=new Calculator();
	}
	
	@Test
	@DisplayName("Test Addition : positive numbers")
	public void testAdd() {
		double result = calculator.add(1000, 500);
		double excpected = 1500.0;
		Assertions.assertEquals(excpected, result);
	}
	
	@Test
	@DisplayName("Test Addition : negative numbers")
	public void testAddNegative() {
		double actual = calculator.add(-300, -100);
		double expected = -400.0;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test Addition : postive & negative numbers")
	public void testAddPositiveNegative() {
		double actual = calculator.add(300, -100);
		double expected = 200.0;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test Substraction : postive numbers")
	public void testSustractionA() {
		double actual = calculator.sub(300, 100);
		double expected = 200.0;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("Test Substraction : postive numbers")
	public void testSustractionB() {
		double actual = calculator.sub(100, 300);
		double expected = 0.0;
		Assertions.assertEquals(expected, actual);
	}

}