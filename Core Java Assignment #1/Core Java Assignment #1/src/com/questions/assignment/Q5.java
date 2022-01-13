package com.questions.assignment;

public class Q5 {
	public static void substring(String s, int idx ) {
		char[] a = s.toCharArray();
		for (int i = 0; i < idx-1; i++) {
			System.out.print(a[i]);
		}
	}
}
