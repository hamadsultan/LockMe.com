package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//This class for Searching for a file
public class FileSearch {
	public static void main(String[] args) throws IOException {
		String path = "/Users/hamadalsultan/Documents/caltech/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file that you want to search");
		String FileNameSearch = sc.next();
		File file = new File(path);
		// display operation
		File FileName[] = file.listFiles();
		// for-each
		int flag = 0;
		for (File ff : FileName) {
			if (ff.getName().equals(FileNameSearch)) {
				flag = 1;
				break;
			} else {
				flag = 0;
			}
		}

		if (flag == 1) {
			System.out.println("File is found");
		} else {
			System.out.println("File is not found");
		}
	}

}
