package com.adam;
import java.util.ArrayList;

public class Q19 {
	public static boolean isPrime(int n) {
		//Pass 0 and 1
		if(n == 0 || n == 1) {
			return true;
		}
		//Check numbers >= 2
		for(int i = 2; i < n; i++) 
			if(n % i == 0) {
				return true;
			}
			return false;
	}
	
	public static void number() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//loop to put numbers in an ArrayList
		for (int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		System.out.println("Given this array: " + numbers);
		
		//Create an array for the even and odd numbers
		ArrayList<Integer> evens = new ArrayList<Integer>(); 
		ArrayList<Integer> odds = new ArrayList<Integer>(); 

		for (int n : numbers) {
			if(n % 2 == 0) {
				evens.add(n);
			}else {
				odds.add(n);
			}
		}
		//Add the even and odd values together
		int x = 0;
		int y = 0;
		for(int n : evens) {
			x = x + n;
		}
		for(int n : odds) {
			y = y + n;
		}
		
		System.out.println();
		System.out.println("Here is the sum of the even numbers: " + x);
		System.out.println();
		System.out.println("Here is the sum of the odd numbers: " + y);
		System.out.println();
		
		//Remove the prime numbers
		ArrayList<Integer> noPrimes = new ArrayList<Integer>();
		for(int n : numbers) {
			if(isPrime(n)) {
				noPrimes.add(n);
			}
		}
		System.out.println("And here is the original array with the prime numbers removed: " + noPrimes);
	}
}