package com.hp.interview.exercise;

import java.util.ArrayList;

import com.hp.interview.exceptions.CustomException;

public class MainApp {

	public static void main(String[] args) throws CustomException{
		
		ArrayList<String> fileNames = new ArrayList<String>();
		
		//if no argument passed
		if(args.length == 0){
				throw new CustomException("You should pass at least one argument");
		}
		
		//build an array list of names received in arguments list
		for(String fileName: args){
			fileNames.add(fileName);
		}
		
		try{
			//verify if arguments are files
			Files.areTheseFiles(fileNames);
			// let's process these files
			Files.processFiles(fileNames);
			
		} catch (Exception e) {
			throw new CustomException(e.getMessage());
		}
	}
}
