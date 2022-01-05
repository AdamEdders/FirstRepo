package com.questions.assignment;

public class Q1 {
	public static void bubbleArray(int[] a) {
		//Declaring a variable for ease
		int n = a.length;
		
		//First for loop is to scan through array as many times as needed
		for (int i = 0; i < n-1; i++) {
			//Second for loop actually swaps elements
			for(int j = 0; j < n-i-1; j++) {
				//Checks if current element is less than previous
				if (a[j] > a[j+1]) {
					//Swapping elements
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		//Will go through a print each element in array
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
	}