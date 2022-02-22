package com.scm.javatrainning.day2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h2>Tutorial9B Class</h2>
 * <p>
 * Process for Displaying Tutorial9B
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial9B {
	/**
	 * <h2>scn</h2>
	 * <p>
	 * Scanner for input
	 * </p>
	 */
	static Scanner scn;

	/**
	 * <h2>getLargestNumbers</h2>
	 * <p>
	 * Get largest number.
	 * </p>
	 *
	 * @param nums long[]
	 * @return
	 * @return String
	 */
	public static String getLargestNumbers(long[] nums) {
		String result = "";
		long record = 0;
		for (long x : nums) {
			record = x > record ? x : record;
		}
		result = record + " is the largest number.";
		return result;
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
		boolean stop = false;
		String userconfirm = "";
		System.out.println("Let find the largest number.");
		do {
			try {
				System.out.print("Input 1st number: ");
				long a = scn.nextInt();
				System.out.print("Input the 2nd number: ");
				long b = scn.nextInt();
				System.out.print("Input the 3nd number: ");
				long c = scn.nextInt();
				long[] ary = { a, b, c };
				System.out.println(getLargestNumbers(ary));
				System.out.println("Do you want to continue? (y/n)");
				userconfirm = scn.next();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid input.");
				stop = true;
				break;
			}
		} while (!stop);

	}
}
