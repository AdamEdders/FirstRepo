package com.adam;

public class Driver {
	
	/*Variable scope in Java:
	 * 1. Class scope (static methods and variables)
	 * 2. Instance scope (non-static methods and variables)
	 * 3. Method scope (any variable declared inside an instance)
	 * 4. Block scope (any variable declared inside curly braces)
	 */
	
	public static void main(String[] args) {
		
		staticHelper();
		staticHelper();
		staticHelper();
		
		Animal a = new Animal();
		Animal.count++;
		a.species = "giraffe";
		
		Animal b = new Animal();
		Animal.count++;
		b.species = "tiger";
		
		System.out.println("Animal a: " + Animal.count);
		System.out.println("Animal b: " + Animal.count);
		
		if(a.species == "giraffe") {
			//Here, message belongs to BLOCK scoper
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
}

class Animal {
	
	//Because it is static, it belongs to CLASS scope
	static int count = 0;
	
	//Non-static variables belong to the INSTANCE scope
	String species;
}