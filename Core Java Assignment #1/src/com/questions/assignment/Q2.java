package com.questions.assignment;
//Fibonacci series is where the next term is the sum of the previous two terms.
//First term is 0 and Second term is 1
public class Q2 {
	public static void fibonacci(int a) {
		int firstTerm = 0;
		int secondTerm = 1;
		int i = 0;
		
		System.out.print(firstTerm + " ");
		System.out.print(secondTerm + " ");
		
		while (i <= a) {
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			int hold =nextTerm;
			i++;
			System.out.print(hold + " ");
		}
	}		
}