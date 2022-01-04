package com.questions.assignment;

public class Driver {
	public static void main(String[] args) {
		//array to sort
		int[] array = {1,0,5,6,3,2,3,7,9,8,4};
		//Declaring Q1 as a class instance
		Q1 q1 = new Q1();
		//Calling Q1
		q1.sortArray(array);
		q1.printArray(array);
	}
}