package com.adam;
import java.util.Scanner;
import java.lang.Math;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Q14 {
	public static void squareRoot() {
		//Instantiate Scanner
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter the number you would like to square root.");
		//Take square root of input
		double d = scan2.nextDouble();
		double d2 = Math.sqrt(d);
		System.out.println("The square root of " + d + " is " + d2);
		
		scan2.close();
	}
	
		public static void options() {
		//Instantiate scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 if you would like to find the square root of a number.");
		System.out.println("Enter 2 if you would like to see today's date.");
		System.out.println("Enter 3 if you would like to split a string into an array.");
		
		int x = scan.nextInt();
		switch(x) {
		//list cases
		case 1 :squareRoot();
			break;
		case 2 : DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
					LocalDateTime now = LocalDateTime.now();
					System.out.println("Today's date is: " + dtf.format(now));
			break;
		case 3 : 
			String s = "I am learning Core Java";
			String[] array = s.split(" ");
			System.out.print("String array : [");
			for(int i = 0; i <= array.length -1; i++) {
				System.out.print(array[i] + ", ");
		}
			System.out.print("]");
			break;
		}
		scan.close();
	}

}
