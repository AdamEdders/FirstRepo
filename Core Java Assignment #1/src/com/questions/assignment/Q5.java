package com.questions.assignment;

public class Q5 {
	static String substring(String s, int idx ) {
		//declare 2 arrays
		char[] charArray = s.toCharArray();
		char[] substringArray = new char[idx];
		//Copy over substring
		for (int i = 0; i < idx; i++) {
			substringArray[i] = charArray[i];
		}
		//return substringArray
		return substringArray;

	}
}
