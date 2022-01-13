package com.questions.assignment;
import java.util.ArrayList;

public class Q8 {
	public static void checkPalindrome() {
		//Create an array that contains the original array
		ArrayList<String> original = new ArrayList<String>();
		String[] start = {"karan","madam","tom","civic","radar","jimmy","kayak","john","refer","billy","did"};
		//Loop to add Strings into ArrayList
		for (int i = 0; i < start.length; i++) {
			original.add(start[i]);
		}
		System.out.println("Given this array: " + original);
		
		ArrayList<String> palindromes = new ArrayList<String>();
		//Check if palindrome
		for (String s : original) {
			for (int i = 0; i < s.length() / 3; i++) {
				if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
					palindromes.add(s);
				}
			}
		}
		System.out.println("Here is an array of the palindromes: " + palindromes);
	}
	}