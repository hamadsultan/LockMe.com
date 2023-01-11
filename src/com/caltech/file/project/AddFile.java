package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This class is for creating file in a directory 
public class AddFile {
	public static void main(String[] args) throws IOException {
		String Path = "/Users/hamadalsultan/Documents/caltech/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name that you want to create");
		String FileName = sc.next();
		String FinalPath = Path + FileName;
		System.out.println(FinalPath);

		// Steps for creating the file
		File file = new File(FinalPath);
		boolean res = file.createNewFile();
		if (res != true) {
			System.out.println("File is not created");
		} else {
			System.out.println("File is created");
		}
	}

}
