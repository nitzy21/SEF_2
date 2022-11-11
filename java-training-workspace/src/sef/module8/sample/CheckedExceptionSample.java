package sef.module8.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample {

	public static void main(String arg[]){
		
		String fileName = "someFileThatDoesNotExist.txt";
		FileReader reader ;
		try{
			reader = new FileReader(fileName);
			
		}
		catch(FileNotFoundException ex){
			System.out.println("File " + fileName + " not found");			
		}
	}
}
