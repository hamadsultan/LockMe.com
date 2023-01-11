package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// This class for deleting the file from the directory
public class DeleteFile {
	public static void main(String[] args) throws IOException {
		String Path = "/Users/hamadalsultan/Documents/caltech/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name that you want to delete");
		String FileName = sc.next();
		String FinalPath = Path + FileName;
		System.out.println(FinalPath);

		File file = new File(FinalPath);
		// Delete operation
		file.delete();
		System.out.println("File gets deleted");

	}

}
