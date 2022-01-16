package com.adam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DisneyCharacterTests {
	
	//@Test will mark a method as a test method to run as a test runner
	//A test runner is a program that runs test methods and reports the results
	@Test
	public void testHercules() {
		String s = Results.results('a', 'a', 'a', 'a');
		//If any assertion is not true, the test will fail
		assertEquals(s,"Congratulations, you are most like Hercules!");
	}

	@Test
	public void testGaston() {
		String s = Results.results('b', 'b', 'b', 'b');
		assertEquals(s,"Congratulations, you are most like Gaston!");
	}
	
	@Test
	public void testBelle() {
		String s = Results.results('c', 'c', 'c', 'c');
		assertEquals(s,"Congratulations, you are most like Belle!");
	}
	
	@Test
	public void testOlaf() {
		String s = Results.results('d', 'd', 'd', 'd');
		assertEquals(s,"Congratulations, you are most like Olaf!");
	}
	
	@Test
	public void testFourWayTie() {
		String s = Results.results('a', 'b', 'c', 'd');
		assertEquals(s, "Wow! It seems like you have a bit of everyone in you, please retake the test.");
	}
	
	@Test
	public void testTwoWayTie() {
		String s = Results.results('a', 'a', 'b', 'b');
		assertEquals(s,"Sorry, your answers lead me to believe you are 2 different people, please retake the test.");
	}
}