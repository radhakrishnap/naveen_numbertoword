package com.naveen;

import java.util.Scanner;

import com.naveen.numbertoword.NumberToWord;

/**
 * 
 * @author Naveenkumar
 * @since 1
 * @version 1
 *
 *  MainApp Class used to run main method. Start the application by
 *  using below main method as it's an Stand alone Application
 */
public class MainApp {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			int number;
			// Scanner used to take input number values from console/terminal
			scanner = new Scanner(System.in);
			System.out.println("Enter a number to convert into word : " );
			number = scanner.nextInt();
			System.out.println("English word is "+ number + " = " + NumberToWord.numberToWord(number));
		} catch (Exception e) {
			System.out.println("Error While reading or converting number to Word Form" + e);
		}
	}
}
