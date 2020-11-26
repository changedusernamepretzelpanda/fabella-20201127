package com.mrm.org.problemSet;

import static org.junit.Assert.*;
import com.mrm.org.problemSet.problemA;

import org.junit.Test;

public class problemATest {

	@Test
	public void testWordWithNoPairFirst() {
		String input = "\"dog\", \"dog\", \"dog\"";
		String expected = "\"dog\"";
		assertEquals(expected,problemA.wordWithNoPair(input));
		
	}
	
	@Test
	public void testWordWithNoPairSecond() {
		String input =  "\"dog\", \"cat\", \"dog\", \"cow\", \"cat\"";
		String expected = "\"cow\"";
		assertEquals(expected,problemA.wordWithNoPair(input));
		
	}

	@Test
	public void testWordWithNoPairtH() {
		String input ="\"dog\", \"dog\", \"dog\", \"cat\", \"cat\", \"cat\", \"cat\"";
		String expected = "\"dog\"";
		assertEquals(expected,problemA.wordWithNoPair(input));
		
	}
}
