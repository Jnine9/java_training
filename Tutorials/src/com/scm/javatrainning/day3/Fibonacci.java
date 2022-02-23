package com.scm.javatrainning.day3;
import java.util.Scanner;

/**
 * <h2> Fibonacci Class</h2>
 * <p>
 * Process for Displaying Fibonacci
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Fibonacci {
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input
	 * </p>
	 */
	static Scanner scn;
	/**
	 * <h2> generateFibonacci</h2>
	 * <p>
	 * Generate Fibonacci serie numbers.
	 * </p>
	 *
	 * @param n int
	 * @return void
	 */
	public static void generateFibonacci(int n) {
		int record = 0, lastrecord = 1, num = 0;
		for(int i = 0;i < n;i++) {
			num = record + lastrecord;
			System.out.println(num);
			record = lastrecord;
			lastrecord = num;
		}
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
		scn = new Scanner(System.in);
		boolean stop = false;
		String userconfirm = "";
		int record = 0;
		try {
			do {
				System.out.println("Enter number to generate Fibonacci series : ");
				record = scn.nextInt();
				generateFibonacci(record);
				System.out.println("Do you want to do more ? (y/n)");
				userconfirm = scn.next();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			}while(!stop);
		}catch(Exception e) {
			System.out.println("Please enter a valid input.");
		}
	}
}
