package com.adam;
import java.util.ArrayList;

public class MyArrayList<T extends Employee> {
	
	//In a generic class, T is called a "placeholder type"
	T myThing;
	
	//Can also us placeholder as a type of argument in a method
	public void myMethod(T myParam) {
		
	}
	//can NOT instantiate
	//T[] array = new T[10]; DOES NOT WORK
	Object[] array = new Object[10];
	int size = 0;
	
	public void add(T obj) {
		array[size] = obj;
		++size;
	}
	
	public T get(int i) {
		return (T)array[i];
	}

}