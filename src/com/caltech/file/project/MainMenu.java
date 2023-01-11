package com.caltech.file.project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("Enter the number: \n(1) Show all file in ascending order \n(2) Submenu \n(3) Exit \n ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 3) {
				System.out.println("Thank you for using our program (LockedMe.com) \nHope we see you again soon!");
				break;
			}
			switch (input) {
			case 1:
				String Path = "/Users/hamadalsultan/Documents/caltech/";
				File file = new File(Path);
				// Display operation
				File FileName[] = file.listFiles();
				// For-each
				System.out.println("The list of files in ascending order in the path: \n" + Path + "\nThe files are: ");
				for (File ff : FileName) {
					System.out.println(ff.getName());
				}
				break;
			case 2:

				while (true) {
					System.out.println(
							"Enter the number for submenu: \n(1) Create a file \n(2) Delete a file \n(3) Search for the file \n(4) Exit from the submenu \n");
					Scanner sc1 = new Scanner(System.in);
					int input1 = sc1.nextInt();
					if (input1 == 4) {
						break;
					}
					switch (input1) {
					case 1:
						String Path1 = "/Users/hamadalsultan/Documents/caltech/";
						Scanner sc2 = new Scanner(System.in);
						System.out.println("Enter the file name that you want to create");
						String FileName1 = sc2.next();
						String FinalPath = Path1 + FileName1;
						System.out.println(FinalPath);

						// Steps for creating the file
						File file1 = new File(FinalPath);
						boolean res = file1.createNewFile();
						if (res != true) {
							System.out.println("File is not created");
						} else {
							System.out.println("File is created");
						}
						break;
					case 2:
						String Path2 = "/Users/hamadalsultan/Documents/caltech/";
						Scanner sc3 = new Scanner(System.in);
						System.out.println("Enter the file name that you want to delete");
						String FileName2 = sc3.next();
						String FinalPath2 = Path2 + FileName2;
						System.out.println(FinalPath2);

						File file2 = new File(FinalPath2);
						// Delete operation
						if (file2.delete()) {
							System.out.println(file2.getName() + " File gets deleted");
						} else {
							System.out.println("Delete is failed");
						}

						break;
					case 3:
						String path = "/Users/hamadalsultan/Documents/caltech/";
						Scanner sc4 = new Scanner(System.in);
						System.out.println("Enter the file that you want to search");
						String FileNameSearch = sc4.next();
						File file3 = new File(path);
						// display operation
						File FileName3[] = file3.listFiles();
						// for-each
						int flag = 0;
						for (File ff : FileName3) {
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
						break;
					case 4:
						break;
					default:
						System.out.println("Invalid input");
						break;
					}

				}
			case 3:
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
		}
	}
}
