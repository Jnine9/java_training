package com.scm.javatrainning.day2;

import java.util.Scanner;

/**
 * <h2>Tutorial9C Class</h2>
 * <p>
 * Process for Displaying Tutorial9C
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial9C {
	static Scanner scn;
	/**
	 * <h2> determinYear</h2>
	 * <p>
	 * Determine a leap year.
	 * </p>
	 *
	 * @param year int
	 * @return
	 * @return String
	 */
	public static String determinYear(int year) {
		String res = "";
		res = year % 4 == 0 && year % 100 != 0 ? "It's a Leap Year"
				: year % 400 == 0 ? "It's a Leap Year" : "It's not a Leap Year";
		return res;
	}
	/**
	 * <h2>main</h2>
	 * <p>
	 * Main method to run project.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		scn = new Scanner(System.in);
		System.out.println("Enter Leap Year : ");
		int year = scn.nextInt();
		System.out.println(determinYear(year));
	}
}
