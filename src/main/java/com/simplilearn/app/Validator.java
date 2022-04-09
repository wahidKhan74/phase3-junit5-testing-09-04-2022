package com.simplilearn.app;

public class Validator {

	// age validator
	public boolean ageValidator(int age) {
		if(age>18) {
			return true;
		}
		return false;
	}
	
	// input empty string validator
	public boolean isEmpty(String input) {
		if(input !=null && input.length() > 0) {
			return false;
		}
		return true;
	}
}
