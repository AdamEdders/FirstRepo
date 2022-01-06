package com.questions.assignment;
//import ArrayList
import java.util.ArrayList;

public class Q9 {
	public static boolean checkPrime(int test) {
		//Disqualify 0 and 1
		if (test == 0 || test == 1) {
			return false;
		}
		//Check numbers 2 to 100
		for (int i = 2; i< test; i++)
			if (test % i == 0) {
				return false;
			}
	return true;
	}
	
	public static void isPrime() {
		//Create an Array List
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//add numbers 1 to 100 into an Array list
		for (int i = 0; i <= 100; i++) {
			numbers.add(i);
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
