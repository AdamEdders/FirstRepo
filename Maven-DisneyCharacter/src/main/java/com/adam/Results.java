package com.adam;
//import ArrayList
import java.util.ArrayList;

public class Results extends Question1 {
	public static String results(char a, char b, char c, char d) {
		//Put answers into an array
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		String c1 = String.valueOf(c);
		String d1 = String.valueOf(d);
		String[] answers = {a1,b1,c1,d1};
		
		//tally the answers
		int hercules = 0;
		int gaston = 0;
		int belle = 0;
		int olaf = 0;
		
		for (String s : answers) {
			for (int i = 0; i < 1; i++) {
				if (s.charAt(i) == 'a') {
					hercules++;
				}else if(s.charAt(i) == 'b') {
					gaston++;
				}else if(s.charAt(i) == 'c') {
					belle++;
				}else if(s.charAt(i) == 'd') {
					olaf++;
				}
			}
		}
		
		//Find highest answer choice
		ArrayList<Integer> choices = new ArrayList<Integer>();
		choices.add(hercules);
		choices.add(gaston);
		choices.add(belle);
		choices.add(olaf);
		
		int max = choices.get(0);
		int max2 = 0;
		for (int i = 1; i < 4; i++) {
			if(choices.get(i) == max) {
				max2 = choices.get(i);
			}else if(choices.get(i) > max) {
				max = choices.get(i);
			}
		}
		//Print results
		System.out.println();
		if(max2 < 2 ) {
			if(hercules == gaston && gaston == belle && belle == olaf) {
				return "Wow! It seems like you have a bit of everyone in you, please retake the test.";
			}else if(hercules == max) {
				return "Congratulations, you are most like Hercules!";
			}else if(gaston == max) {
				return "Congratulations, you are most like Gaston!";
			}else if(belle == max) {
				return "Congratulations, you are most like Belle!";
			}else if(olaf == max) {
				return "Congratulations, you are most like Olaf!";
			}
		}else if(max2 == 2) {
			return "Sorry, your answers lead me to believe you are 2 different people, please retake the test.";
		}
		return "Something went wrong, please retake this test!";
	}
}