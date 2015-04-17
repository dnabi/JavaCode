package com.hp.interview.util;

import java.util.ArrayList;
import java.util.Collections;


public class Utils {
	
	/**
	 * This method reverses an array list
	 * @param arrayList of strings
	 * @return arraylist of Strings
	 */
	public static ArrayList<String> reverseArray(ArrayList<String> list){
		Collections.reverse(list);
		return list;
	}
	
	/**
	 * This method receives a string and reverses it 
	 * @param str
	 * @return String reversed line
	 */
	public static String reverseString(String str){

		String reversedString = "";
		
		if(str.length() == 0)
			return reversedString;
		
		for(int i = str.length() - 1; i>=0 ;i--){ // start from the end of the line
			reversedString = reversedString + str.charAt(i);// get the character at this index and append to reversedLine
		}
		
		return reversedString;
	}
}
