package com.mrm.org.problemSet;

import java.util.List;

public class problemB {

	/*
	 * Input: [3, 2, 4, 6, 8, 10], 18 
	 * Output: [4,6,8]
	 * Note: outputs 4, 6 and 8 because 4 + 6 + 8 = 18
	 * Input: [2, 2, 4, 6, 8, 2], 6 
     * Output: [2,2,2]
	 * Note: because 2 + 2 + 2 = 6
     * Input: [0, 2, 3, 6], 9 
     * Output: [0, 3, 6]
	 * */
	
	
	@SuppressWarnings("unused")
	public static String getAdditionSentence(String input) {
		String[] parseString = UtilityClass.parseString(input);
		String[] arrayAddelem= UtilityClass.parseStringB(input)[0].split(",");
		int[] arrayAddelemtoInt = UtilityClass.toArrayInteger(arrayAddelem);
		String AdditionSentence = UtilityClass.getAdditionSentence(Integer.parseInt(UtilityClass.parseStringB(input)[1]), 
				arrayAddelemtoInt.length, 
				arrayAddelemtoInt);
		return AdditionSentence;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "[0, 2, 3, 6], 9";
		System.out.println(UtilityClass.parseStringB(input)[0]);
		System.out.println(UtilityClass.parseStringB(input)[1]);
		System.out.println(getAdditionSentence(input));

	}

}
