package com.simplilearn.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


public class ValidatorTest {
	
	Validator validator;
	
	@BeforeEach
	public void setUp() {
		validator = new Validator();
	}
	
	@Test
	@DisplayName("Age Validtor : positive number age")
	public void testAge() {
		assertEquals(true , validator.ageValidator(35));
		assertTrue(validator.ageValidator(35));
		// assertFalse(validator.ageValidator(35));
	}
	
	@Test
	@DisplayName("Age Validtor : negative number age")
	public void testAgeNegavtive() {
		assertEquals(false , validator.ageValidator(-35));
		assertFalse(validator.ageValidator(-35));
	}
	
	@Test
	@DisplayName("Input validator : Not null or not empty")
	public void testInput() {
		assertEquals(false, validator.isEmpty("john"));
		assertEquals(false, validator.isEmpty("@#$45"));
		assertFalse(validator.isEmpty("@#$45"));
	}
	
	@Test
	@DisplayName("Input validator : null or empty")
	public void testInputNull() {
		assertEquals(true, validator.isEmpty(""));
		assertEquals(true, validator.isEmpty(null));
		assertTrue(validator.isEmpty(null));
	}
	
	@AfterEach
	public void cleanUp() {
		validator = null;
	}
}
