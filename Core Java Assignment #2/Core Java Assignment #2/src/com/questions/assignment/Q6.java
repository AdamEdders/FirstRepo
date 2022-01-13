package com.questions.assignment;

public class Q6 {
	public static void isEven(long l) {
		String s = String.valueOf(l);
		char[] a = s.toCharArray();
		int n = a[a.length-1];
		
		//Check if last number is even
		if (n == '2' || n =='4' || n == '6' || n == '8' || n == '0') {
			System.out.println("Your number is even!");
		}else {
			System.out.println("Your number is odd!");
		}
	}
}
