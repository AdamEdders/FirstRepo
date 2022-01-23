package com.adam;
//import Scanner
import java.util.Scanner;
//import logging
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Question1 {
	private static final Logger logger = LogManager.getLogger(Question1.class);
	
	//Do this to access variables in Driver class
	static char answer1;
	static char answer2;
	static char answer3;
	static char answer4;
	
	@SuppressWarnings("resource")
	public static void question1() {
		boolean test1 = true;
		while(test1) {
			try {
				//Instantiate scanner and ask first question
				Scanner scanner = new Scanner(System.in);
				System.out.println();
				System.out.println("Alright, first question: From the following adjectives, which one describes you the most?");
				System.out.println();
				System.out.println("A) Brave"); //Hercules
				System.out.println("B) Handsome"); //Gaston
				System.out.println("C) Intelligent");//Belle
				System.out.println("D) Comedian"); //Olaf
				System.out.println();
				System.out.print("Enter your answer here: ");
				String response1 = scanner.nextLine();
				response1.toLowerCase();
				answer1 = response1.charAt(0);
				test1 = false;
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println();
				logger.error("User did not answer Question 1 correctly.");
				System.out.println();
				System.out.println("********************************************************");
				System.out.println("It seems that you did not type in your answer correctly.");
				System.out.println("Please enter just the letter associated with your answer choice.");
				System.out.println("********************************************************");
				System.out.println();
			}
		}
		
		boolean test2 = true;
		while(test2) {
			try {
				//Ask second question
				Scanner scanner2 = new Scanner(System.in);
				System.out.println();
				System.out.println("Great choice! Now for the second question:");
				System.out.println("What is your first reaction when you see someone is in danger?");
				System.out.println();
				System.out.println("A) Step in and save them"); //Hercules
				System.out.println("B) Search for help"); //Gaston
				System.out.println("C) Come up with a plan to save them"); //Belle
				System.out.println("D) Run!"); //Olaf
				System.out.println();
				System.out.print("Enter your answer here: ");
				String response2 = scanner2.nextLine();
				response2.toLowerCase();
				answer2 = response2.charAt(0);
				test2 = false;
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println();
				logger.error("User did not answer Question 2 correctly.");
				System.out.println();
				System.out.println("********************************************************");
				System.out.println("It seems that you did not type in your answer correctly.");
				System.out.println("Please enter just the letter associated with your answer choice.");
				System.out.println("********************************************************");
				System.out.println();
			}
		}
		
		boolean test3 = true;
		while(test3) {
			try {
				// Ask third question
				Scanner scanner3 = new Scanner(System.in);
				System.out.println();
				System.out.println("Wow, I didn't expect that from you. Anyways, on to the third question:");
				System.out.println("Which of these do you fear the most?");
				System.out.println();
				System.out.println("A) Failure"); //Hercules
				System.out.println("B) Making a fool of yourself"); //Gaston
				System.out.println("C) Not keeping your promise"); //Belle
				System.out.println("D) Having to save the day"); //Olaf
				System.out.println();
				System.out.print("Enter your answer here: ");
				String response3 = scanner3.nextLine();
				response3.toLowerCase();
				answer3 = response3.charAt(0);
				test3 = false;
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println();
				logger.error("User did not answer Question 3 correctly.");
				System.out.println();
				System.out.println("********************************************************");
				System.out.println("It seems that you did not type in your answer correctly.");
				System.out.println("Please enter just the letter associated with your answer choice.");
				System.out.println("********************************************************");
				System.out.println();
			}
		}
		
		boolean test4 = true;
		while(test4) {
			try {
				//ask the fourth question
				Scanner scanner4 = new Scanner(System.in);
				System.out.println();
				System.out.println("That was very honest of you! Now, for the last question:");
				System.out.println("Does true love exist?");
				System.out.println();
				System.out.println("A) I like to believe so"); // Hercules
				System.out.println("B) Its true that others love me");//Gaston
				System.out.println("C) I have already found it"); //Belle
				System.out.println("D) Of course it exists!"); // Olaf
				System.out.println();
				System.out.print("Enter your answer here: ");
				String response4 = scanner4.nextLine();
				response4.toLowerCase();
				answer4 = response4.charAt(0);
				test4 = false;
				scanner4.close();
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println();
				logger.error("User did not answer Question 4 correctly.");
				System.out.println();
				System.out.println("********************************************************");
				System.out.println("It seems that you did not type in your answer correctly.");
				System.out.println("Please enter just the letter associated with your answer choice.");
				System.out.println("********************************************************");
				System.out.println();
			}
		}
	
	}

}
