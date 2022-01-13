package com.adam;
import java.util.ArrayList;

public class Q12 {
	public static void evenNumbers() {
		//Create Array Lists
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> evens = new ArrayList<Integer>();
 		for (int i = 2; i <=100; i++) {
			numbers.add(i);
		}
		for (int i : numbers) {
			if (i % 2 == 0) {
				evens.add(i);
			}
		}
		System.out.println(evens);
	}

}
