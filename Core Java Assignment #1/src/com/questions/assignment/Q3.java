package com.questions.assignment;

public class Q3 {
	public static void reverseString(String s) {
		for (int i = s.length(); i > 0; i--) {
			System.out.print(s.charAt(i-1));
		}
	}
}