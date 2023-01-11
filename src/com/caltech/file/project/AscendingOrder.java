package com.caltech.file.project;

import java.io.File;
import java.io.IOException;

//Display the files in an ascending order
public class AscendingOrder {
	public static void main(String[] args) throws IOException {
		String Path = "/Users/hamadalsultan/Documents/caltech/";
		File file = new File(Path);
		// Display operation
		File FileName[] = file.listFiles();
		// For-each
		System.out.println("The list of files in asscending order in the " + Path + "is");
		for (File ff : FileName) {
			System.out.println(ff.getName());
		}
	}
}
