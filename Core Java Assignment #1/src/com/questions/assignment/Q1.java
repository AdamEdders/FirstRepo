package com.questions.assignment;

public class Q1 {
	void sortArray(int[] a) {
		 //Declaring a temporary variable
		 int temp = 0;
		 //for loops to go through array
		 for (int i = 0; i < a.length; i++) {
			 for(int j = 0; j < a.length-1-i; i++) {
				 if (a[j] > a[j+1]) {
					 //swapping elements
					 temp = a[j];
					 a[j] = a[j +1];
					 a[j+1] = temp;
				 }
			 }
		 }
	}
	void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
