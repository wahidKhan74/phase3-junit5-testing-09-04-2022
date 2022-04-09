package com.simplilearn.app;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Standard Test")
public class StandardTest {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("--- Before all test exicuted ---");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("--- Before each test exicuted ---");
	}
	
	@Test
	@DisplayName("Test One")
	public void testOne() {
		System.out.println("--- Test one is exicuted ---");
	}
	
	@Test
	@DisplayName("Test Two")
	public void testTwo() {
		System.out.println("--- Test Two is exicuted ---");
	}
	
	@Test
	public void testThree() {
		System.out.println("--- Test Three is exicuted ---");
	}

	@AfterEach
	public void cleanUp() {
		System.out.println("--- After each test exicuted ---");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("--- After all test exicuted ---");
	}
	
}
