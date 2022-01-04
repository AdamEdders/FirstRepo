package com.questions.assignment;
//Fibonacci series is where the next term is the sum of the previous two terms.
//First term is 0 and Second term is 1
public class Q2 {
	public static int Fibonacci(int a) {
		//Declaring starting variables
		int n = a; //Determines length of series
		int firstTerm= 0;
		int secondTerm = 1;
		
		for (int i = 0; i < n; i++) {
			System.out.println(firstTerm + ", ");
			//computing the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			
			return nextTerm;
		}
		
		
	}

}
