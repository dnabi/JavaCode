package com.hp.interview.files.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import com.hp.interview.exercise.Files;

public class FilesTest {

	@Test
	public void areTheseFilesTest() {
		ArrayList<String> fileNames = new ArrayList<String>();
		Random randomGenerator = new Random();
		
		String file1 = "test" + randomGenerator.nextInt(100) + "txt";
		String file2 = "test" + randomGenerator.nextInt(100) + "txt";
		
		fileNames.add(file1);
		fileNames.add(file2);
		
		try{
			Files.areTheseFiles(fileNames);
		}catch(Exception e){
			assertEquals("Error: " + file1 + " is not a file!",e.getMessage());
		}
	}
}
