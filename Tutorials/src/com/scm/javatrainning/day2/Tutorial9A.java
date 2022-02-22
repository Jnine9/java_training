package com.scm.javatrainning.day2;

import java.util.Scanner;

/**
 * <h2> Tutorial9A Class</h2>
 * <p>
 * Process for Displaying Tutorial9A
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial9A {
	static Scanner input;
	/**
	 * <h2> testData</h2>
	 * <p>
	 * Determine whether number is positive of negative.
	 * </p>
	 *
	 * @param num int
	 * @return
	 * @return String
	 */
	public static String testData(int num) {
		String res = "";
		res = num > 0 ? "Number is poitive.":
			"Number is negative.";
		return res;
	}
	/**
	 * <h2> main</h2>
	 * <p>
	 * Main method to run project.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("Test Data\nEnter Input Number : ");
		int num = input.nextInt();
		System.out.println(testData(num));
	}

}
