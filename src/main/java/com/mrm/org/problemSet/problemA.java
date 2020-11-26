package com.mrm.org.problemSet;

import java.util.List;

public class problemA {
	/*
	 * PROBLEM A [ 2 points ] Output the word with no pair. 
	 *  Input is guaranteed to always have 1 possible output.
	 *  Input: “dog”, “dog”, “dog”
	 *  Output: “dog”
     *  Input: “dog”, “cat”, “dog”, “cow”, “cat”
     *  Output: “cow”
     *  Input: “dog”, “dog”, “dog”, “cat”, “cat”, “cat”, “cat”
     *  Output: “dog”
	 *
	 * */
	
	@SuppressWarnings("unused")
	public static String wordWithNoPair(String input) {
		String[] parseString = UtilityClass.parseString(input);
		List<String> toArrayList = UtilityClass.toArrayList(parseString);
		return UtilityClass.returnRefactoredList(toArrayList).trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "\"dog\", \"dog\", \"dog\"";
		System.out.println(wordWithNoPair(input1));
		
		String input2 = "\"dog\", \"cat\", \"dog\", \"cow\", \"cat\"";
		System.out.println(wordWithNoPair(input2));
		
		String input3 ="\"dog\", \"dog\", \"dog\", \"cat\", \"dog\", \"emma fabella\", \"emma fabella\"";
		System.out.println(wordWithNoPair(input3));

		
	}

}
