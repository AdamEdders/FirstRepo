package com.revature.datatypes;

public class Driver {
	public static void main(String[] args) {
		
		//Instantiating a new DataTypes object
		DataTypes dt = new DataTypes();
		//Requests a block of memory the size of DataTypes to store the object in
		// then it returns the memory address in 'dt'
		//DataTypes() tells it to run the constructor immediately after creation
		
		
		System.out.println(dt.add(1, 2));
		
		int answer = dt.add(55, 45);
		
		System.out.println(answer);
		
		Dog felix = new Dog(), henry = new Dog(), patty = new Dog();
		
		felix.name = "Felix";
		felix.age = 2;
		felix.weight = 106.5;
		felix.breed = "German Sheperd";
		
		henry.name = "Henry";
		patty.name = "Patty";
		
		dt.printDogName(felix);
		dt.printDogName(henry);
		dt.printDogName(patty);
		System.out.println(felix.age);
	}

}
