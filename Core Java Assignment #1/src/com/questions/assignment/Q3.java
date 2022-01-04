package com.questions.assignment;

public class Q3 {
	public void reverseString() {
		//String we will reverse
		String s = "Adam";
		//Converting String to an Array
		char a[] = s.toCharArray();
		int n = s.length();
		//Establishing starting and end points
		int first = 0;
		int last = n-1;
		
		while (first < last) {
			a[first]^= a[last];
			a[last]^=a[first];
			a[first]^=a[last];
			
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		}
	}

}
