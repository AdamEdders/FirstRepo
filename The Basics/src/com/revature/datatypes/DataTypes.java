package com.revature.datatypes;

public class DataTypes {
	public void dataTypes() {
		//Representing numbers
		int i = 0; //Declaring i as a variable with integer value 1
		short s; // Declaring s as a variable with a short value of 16 bits
		long l; // Declaring l as a variable with a long value og 64 bits
		
		//Representing Fractions
		float f = 3.9f; // 32 bits
		double d = 3.9; // 64 bits
		
		//Letters
		char c = 'c'; // 16 bits
		
		//True and False
		boolean b = true; // 1 bit either 0 for false or 1 for true
		
		//The basic unit
		byte bt; // 8 bits
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public void printDogName(Dog d) {
		System.out.println("Your dog's name is " + d.name);
	}

}