package com.revature.datatypes;

public class FlowControl {
	public void flowControl() {
		boolean myBoolean = true;
		int i = 5;
		
		if (myBoolean) {
			//This code runs is myBoolean is true
		} else if (i > 5) {
			//Code runs if i > 5
		}else {
			//Code that runs if the previous if-block did not run
			//This is the "catch-all" block that will run if no other blocks run
		}
		
		//While loops are meant to run some number of loops until the boolean check is false
		while (myBoolean) {
			//Code will run forever since myBoolean stays true
			//So we can do 2 things:
			myBoolean = false;
			break; //ends current loop
		}
		
		//DoWhile loops always run at least once
		do {
			//loop code here
		} while (myBoolean);
		
		//Loop with a numerical requirement requires a for loop
		String[] names = {"Jacob", "Daniel", "Allison"}; //Initializing an array with data
		String[] otherNames = new String[10]; //Also initializes an array and declares it to contain 10 datapoints
		
		//Starting a for loop
		for (int iteration = 0; iteration < names.length; iteration++) {
			System.out.println(names[iteration]); //Will print all datapoints in the array 'names'
		}
		
		//Enhanced for loop works for running through every single item
		for (String s : names) {
			System.out.println(s);
		}
		
		//Switch Statement is best for limited number of expected values
		//Replaces an extended if-else-if block
		String name = names[0];
		switch (name) {
		case "Jacob":
			System.out.println("Wow its Jacob!");
			// jacob();
			break;
		
		// If there is no break, the switch statement will "fall through" to the next case
			
		case "Daniel":
			System.out.println("Wow its Daniel!");
			// daniel();
			break;
			
			default:
				// Code for no applicable case; error handling
				//Not required
				System.out.println("Oh no, no other case was found!");
		}
	}
}
