package com.mrm.org.problemSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilityClass {
	
	public static String[] parseString(String input) {
		String inputFormat= input.replaceAll(", ",",");
		String[] arrayReturn = inputFormat.split(",");
		return arrayReturn;
	}
	
	@SuppressWarnings("rawtypes")
	public static List<String> toArrayList(String[] input) {
	    List<String> list = Arrays.asList(input);          
	    return list;
	}
	
	@SuppressWarnings("rawtypes")
	public static List<String> returnNewList(List<String> input) {
		List<String> list = new ArrayList<>(); 
		for(int a=0;a<input.size();a++){
			list.add(input.get(a));
		}
		
		for(int a=0;a<list.size();a++) {
			String firstElement = list.get(a);
			for(int i=1;i<list.size();i++) {
		    	String currentElement = list.get(i).toString();
		    	if(currentElement.equals(firstElement)) {
		    		list.remove(i);
		    		list.remove(a);
		    		return list;
		    	}
		    }
	    }
	    
	    return list;
	}
	
	@SuppressWarnings("unchecked")
	public static String returnRefactoredList(List<String> input) {
		   String retString = input.get(0);
		   if(input.size()!=1) {
			   retString=returnRefactoredList(returnNewList(input));
		   }
		   return retString;
	}
	
	public static String[] parseStringB(String input) {
		String inputFormat= input.replaceAll(", ",",");
		String inputFormat2=inputFormat.substring(1, inputFormat.length());
		String[] arrayReturn = inputFormat2.split("],");
		return arrayReturn;
	}
	
	@SuppressWarnings("null")
	public static int[] toArrayInteger(String[] input) {
		int[] arrayReturn =new int[input.length];;
		for(int a = 0;a<input.length;a++) {
			arrayReturn[a]=Integer.parseInt(input[a]);
		}
		return arrayReturn;
	}
	
	public static String getAdditionSentence(int sum,int arraySize,int arrayInput[]) 
	{ 
	  for (int firstElement = 0; firstElement < arraySize - 2; firstElement++) { 
	     for (int secondElement = firstElement + 1; secondElement < arraySize - 1; secondElement++) { 
	        for (int thirdElement = secondElement + 1; thirdElement < arraySize; thirdElement++) { 
	          if (arrayInput[firstElement] + arrayInput[secondElement] + arrayInput[thirdElement] == sum) { 
	                 String additionSentence =  "[" + arrayInput[firstElement] + "," + arrayInput[secondElement] + "," + arrayInput[thirdElement]+"]";
	                 return additionSentence; 
	               } 
	          } 
	        } 
	  } 
	    return ""; 
	} 
}
