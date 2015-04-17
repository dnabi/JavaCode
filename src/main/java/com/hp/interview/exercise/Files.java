package com.hp.interview.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.hp.interview.util.Utils;

public class Files {

	/**
	 * This method verifies if the argument is a file
	 * 
	 * @param fileNames list of names
	 * @throws Exception 
	 * @throws FileNotFoundException 
	 */
	public static void areTheseFiles(ArrayList<String> fileNames) throws Exception{
		
		for(String fileName:fileNames){
			if(new File(fileName).isFile() == false){
				throw new Exception("Error: " + fileName + " is not a file!");
			}
		}	
	}
	
	/**
	 * This method opens files, reads the lines in each file, reverse lines and saves them in an array
	 * then reverses the array and then displays the content of the array
	 * @param fileName
	 */
	public static void processFiles(ArrayList<String>fileNames) throws IOException{
		
		String oneline;
		BufferedReader reader = null;
		ArrayList<String> lines = new ArrayList<String>();
 		
		// read each file in the list
		for(String fileName: fileNames){
			//Open the file and read each line
			reader = new BufferedReader(new FileReader(fileName)); 
			// while the end of the file is not reached read one line
			while((oneline = reader.readLine()) != null){
				lines.add(Utils.reverseString(oneline)); // reverse the and then add it  in the arrayList.
			}
		}
		
		//let's reverse this array list. we want last file displayed first
		lines = Utils.reverseArray(lines);
		printLines(lines);
	}
	
	
	public static void printLines(ArrayList<String> lines){
		for(String line: lines)
			System.out.println(line);
	}
}
