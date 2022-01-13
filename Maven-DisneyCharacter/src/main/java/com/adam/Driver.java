
package com.adam;
//import Scanner
import java.util.Scanner;

public class Driver extends Question1 {
	public static void main(String[] args) {
		//Introduction and instructions
		Scanner scanner = new Scanner(System.in);
		System.out.println("Howdy, and welcome.");
		System.out.println("You are about to find which 'Disney Character' are you!");
		System.out.println();
		System.out.println("Note: Please answer with a letter as your answer choice.");
		System.out.print("Press Enter to start!");
		
		@SuppressWarnings("unused")
		String blank = scanner.nextLine();
		//Calling all questions
		Question1.question1();
		//Return results
		char a = Question1.answer1;
		char b = Question1.answer2;
		char c = Question1.answer3;
		char d = Question1.answer4;
		System.out.println(Results.results(a,b,c,d));
		scanner.close();
	}

}