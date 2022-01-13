package com.questions.assignment;

public class Q4 {
	public static void factorial(int n) {
		long fact = 1l;
		for (int i = 2; i <= n; i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}
}