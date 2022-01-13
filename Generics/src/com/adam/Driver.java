package com.adam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayDeque;

public class Driver {
	
	public static void main(String[] args) {
		
		//ArrayList is a generic collection
		//Generic classes require the target object type to be specified within "<>"
		ArrayList<Object> list = new ArrayList<Object>();
		Object o = new Object(), p = new Object();
		
		//.add will add the object to the list
		//.get will get the object at that index
		//.set(index, newObject) will replace the current object at an index with a new one
		list.add(o);
		list.add(p);
		list.get(0);
		
		ArrayList<Employee> emplList = new ArrayList<Employee>();
		
		//If we want to store primitives we must use a wrapper class
		//i.e int will not work, but Integer will
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//Sets are used to guarantee unique data
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.remove(3);
		//Cannot use get, a set does NOT have indexes
		//set.get(3); would NOT work
		
		//Deques are used to process lists of data in order, one at a time
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		//push means add to end of the queue
		deque.push(3);
		//pop means take from the top of the queue
		int val = deque.pop();
		
		//Maps are used when we need key-value behavior; to associate a string with an object reference
		HashMap<String, Employee> myMap = new HashMap<String, Employee>();
		//to insert into a map, use put with your key and value
		myMap.put("jacob", new Employee());
		//to retrieve use get
		Object myobject = myMap.get("jacob");
		
		//In order to traverse an entire map, you can traverse the map's list of keys
		Set<String> keys = myMap.keySet();
		for (String key : keys) {
			Employee e = myMap.get(key);
		}
		
		//Alternative way of navigating any collection
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			//Process the current key
			}
		
		MyArrayList<Employee> myArrayList = new MyArrayList<Employee>();
		myArrayList.add(new Employee());
	}

}

class Employee{
	
	public void myMethod() {
	
	}
}
