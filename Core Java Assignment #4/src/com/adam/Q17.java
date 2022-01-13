package com.adam;
import java.util.Scanner;

public class Q17 {
	public static void getInterest() {
		//Instantiate Scanner to ask user for inputs
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your principal? (starting amount) ");
		double principal = scanner.nextDouble();
		System.out.print("What is your rate of interest as a percent? ");
		double rate = scanner.nextDouble();
		System.out.print("How many years will pass? ");
		double years = scanner.nextDouble();
		
		//Return result
		double product = principal * years * (rate/100);
		System.out.println();
		System.out.println("You will have made $" + product + " in interest!" );
		scanner.close();
		
	}

}
