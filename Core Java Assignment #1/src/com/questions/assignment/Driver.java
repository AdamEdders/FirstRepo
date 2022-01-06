package com.questions.assignment;

public class Driver {
	public static void main(String[] args) {
	//Declare an array
		int[] array = {3,5,8,6,1,4,9,0,2,7};
	//Call Q1
		Q1.bubbleArray(array);
		System.out.println();
		System.out.println();
		
	//Declare how many numbers we want
		int f = 14;
	//Call Q2
		Q2.fibonacci(f);
		System.out.println();
		System.out.println();
		
	//Declare string we will reverse
		String s = "Hello World!";
	//Call Q3
		Q3.reverseString(s);
		System.out.println();
		System.out.println();
		
	//Declare what number to take factorial of
		int fact = 5;
	//Call Q4
		Q4.factorial(fact);
		System.out.println();
		
	//Declare what string and how many letters to cut
		String str = "Hello World!";
		int cut = 8;
		
		Q5.substring(str, cut);
	}
}