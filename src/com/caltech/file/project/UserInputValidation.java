package com.caltech.file.project;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class UserInputValidation {
	public static void main(String[] args) {
//		int id ;
//		Scanner KeyEnter = new Scanner(System.in);
//		boolean InputValidate = true; 
//		do 
//		{
//			System.out.println("Selecte the number of the choose: \n");
//			if(KeyEnter.hasNextInt())
//			{
//				id = KeyEnter.nextInt();
//			}
//			else
//			{
//				KeyEnter.next(); // Keyboard buffer flushing
//				continue; // Skip the remaining line of the loop block and repeat				}
//				InputValidate = false;
//		    }
//		} while(InputValidate);
//			{
//				System.out.println("your selection is: \n" + id);
//			}
		while (true) {
			int input = 0;
			System.out.println("Enter an Integer value ");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				input = sc.nextInt();
				if (input > 0)
					System.out.println("You entered a positive integer " + input);
				else {
					System.out.println("You entered a negative integer " + input);
				}
			} else {
				System.out.println("Please Enter Valid Integer");
			}

		}

	}

}
