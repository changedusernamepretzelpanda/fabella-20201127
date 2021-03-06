package com.mrm.org.problemSet;

import java.util.List;

/*
 * Input = 1, 1, 2, 3
 * Output = 1, 3
 * Input = 1, 2, 2, 3, 3, 0, 8, 10
 * Output = 0, 10
 * Note: the uptrend 0, 8, 10 (10 minus 0 is 10) is bigger than the first uptrend 1 � 3 (3 minus 1 is 2).
 * Input = 5, 4, 3, 2, 1
 * Output = empty, �� or null
 * Note: this is a down trend so no output.
 * Input = 5, 4, 3, 2, 1, 2
 * Output = 1, 2
 * Note: uptrend is from 1 to 2 only, the first part is a downtrend.
 * */

public class problemC {
	
	
	@SuppressWarnings("unused")
	public static String uptrendMinMax(String input) {
		String[] parseString = UtilityClass.parseString(input);
		int[] arrayAddelemtoInt = UtilityClass.toArrayInteger(parseString);
		//return UtilityClass.returnRefactoredList(toArrayList).trim();
		//System.out.println(parseString[0]+parseString[1]+parseString[2]+parseString[3]);
		//UtilityClass.longest(arrayAddelemtoInt);
		List<Integer> longest=UtilityClass.longest(arrayAddelemtoInt);
		return longest.get(0)+","+longest.get(longest.size()-1);
	}
	
	
	public static void main(String args[]) {
		String input1 = "5, 4, 3, 2, 1, 2";
		System.out.println(uptrendMinMax(input1));
	}

}
