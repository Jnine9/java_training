package com.scm.javatrainning.day1;

/**
 * <h2>Tutorial1 Class</h2>
 * <p>
 * Process for Displaying Tutorial1. -Display number between 1 to 100.
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial1 {
	/**
	 * <h2>displayNumberBetween</h2>
	 * <p>
	 * Display all number.
	 * </p>
	 *
	 * @param numbers int
	 * @return void
	 */
	public static void displayNumberBetween(int numbers) {
		for (int i = 0; i < numbers; i++) {
			System.out.print(i + 1 + ", ");
		}
	}
	/**
	 * <h2>main</h2>
	 * <p>
	 * Main method to run program.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		displayNumberBetween(100);
	}
}
