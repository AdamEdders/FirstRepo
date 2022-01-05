package com.questions.assignment;

public class Driver {
	public static void main(String[] args) {
	//Declare an array
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
	//Call Q1
		Q1.bubbleArray(array);
		System.out.println();
		
	//Declare how many numbers we want
		int f = 25;
	//Call Q2
		Q2.fibonacci(f);
		System.out.println();
		
	//Declare string we will reverse
		String s = "Adam";
	//Call Q3
		Q3.reverseString(s);
		System.out.println();
		
	//Declare what number to take factorial of
		int fact = 7;
	//Call Q4
		Q4.factorial(fact);
		System.out.println();
		
	//Declare what string and how many letters to cut
		String str = "Hello";
		int cut = 5;
		
		Q5.substring(str, cut);
	}
}