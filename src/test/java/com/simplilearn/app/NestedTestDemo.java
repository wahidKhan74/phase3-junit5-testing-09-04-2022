package com.simplilearn.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Test Class")
public class NestedTestDemo {

	
	@Test
	void testOuter() {
		System.out.println("-- Outer Test Completed !---");
	}
	
	// nested test
	@Nested
	@DisplayName("Group A")
	class InnerTest {
		
		@Test
		void testOne() {
			System.out.println("-- Test One Completed !---");
		}
		
		@Test
		void testTwo() {
			System.out.println("-- Test Two Completed !---");
		}
	}
	
	
	@Nested
	@DisplayName("Group B")
	class InnerTest2 {
		
		@Test
		void testThree() {
			System.out.println("-- Test Three Completed !---");
		}
		
		@Test
		void testFour() {
			System.out.println("-- Test Four Completed !---");
		}
	}
}
