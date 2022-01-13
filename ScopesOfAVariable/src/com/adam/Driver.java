package com.adam;

public class Driver {
	
	/*Variable scope in Java:
	 * 1. Class scope (static methods and variables)
	 * 2. Instance scope (non-static methods and variables)
	 * 3. Method scope (any variable declared inside an instance)
	 * 4. Block scope (any variable declared inside curly braces)
	 */
	
	public static void main(String[] args) {
		
		//Var args example
		//Var args can take 0 or more arguements and turn them into an array
		showVarArgs("Tom","Jose","Bob");
		
		staticHelper();
		staticHelper();
		staticHelper();
		
		Animal a = new Animal();
		Animal.count++;
		a.species = "giraffe";
		
		Animal b = new Animal();
		Animal.count++;
		b.species = "tiger";
		
		System.out.println("Animal a: " + Animal.count + ", " + a.species);
		System.out.println("Animal b: " + Animal.count + ", " + b.species);
		
		if(a.species == "giraffe") {
			//Here, message belongs to BLOCK scope
			String message = "Wow, its a giraffe!";	
			System.out.println(message);
		}
	}
	
	public static void staticHelper() {
		
		//this variable belongs to the METHOD scope
		//It only exists so long as the method is executing
		int methodInt = 0;
		++methodInt;
		
		System.out.println(methodInt);
	
	}
	//If multiple paramaters the var args paramater must be the final paramter
	public static void showVarArgs(String s2, String... strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}
}

class Animal {
	
	//Because it is static, it belongs to CLASS scope
	static int count = 0;
	
	//Non-static variables belong to the INSTANCE scope
	String species;
}