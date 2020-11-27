package com.mrm.org.problemSet;

import static org.junit.Assert.*;

import org.junit.Test;

public class problemCTest {

	@Test
	public void test() {
		String input = "1, 1, 2, 3";
		String expected = "1,3";
		assertEquals(expected,problemC.uptrendMinMax(input));
	}

}
