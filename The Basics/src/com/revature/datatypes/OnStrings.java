package com.revature.datatypes;

public class OnStrings {
	public static void main(String[] args) {
		showCoolFeature();
	}
	public static void showCoolFeature() {
		
		char[] charName = {'J','a','c','o','b'};
		
		String s = new String(charName);
		
		char[] newArray = s.toCharArray();
		
		System.out.println(s);
		System.out.println(newArray);
	}
}
