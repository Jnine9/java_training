package com.scm.javatrainning.day2;

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
	 * <h2> scn</h2>
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
	 * @param nums int[]
	 * @return
	 * @return String
	 */
	public static String getLargestNumbers(int[] nums) {
		String result = "";
		int record = 0;
		for (int x : nums) {
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
		System.out.print("Test Data\nInput 1st number: ");
		int a = scn.nextInt();
		System.out.print("Input the 2nd number: ");
		int b = scn.nextInt();
		System.out.print("Input the 3nd number: ");
		int c = scn.nextInt();
		int[] ary = { a, b, c };
		System.out.println(getLargestNumbers(ary));
	}
}
