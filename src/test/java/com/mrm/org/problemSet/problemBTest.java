package com.mrm.org.problemSet;

import static org.junit.Assert.*;

import org.junit.Test;

public class problemBTest {

	@Test
	public void testWordWithNoPairFirst() {
		String input = "[3, 2, 4, 6, 8, 10], 18";
		String expected = "[2,6,10]";
		assertEquals(expected,problemB.getAdditionSentence(input));
		
	}
	
	@Test
	public void testWordWithNoPairSecond() {
		String input =  "[2, 2, 4, 6, 8, 2], 6";
		String expected = "[2,2,2]";
		assertEquals(expected,problemB.getAdditionSentence(input));
		
	}

	@Test
	public void testWordWithNoPairtH() {
		String input ="[0, 2, 3, 6], 9";
		String expected = "[0,3,6]";
		assertEquals(expected,problemB.getAdditionSentence(input));
		
	}

}
