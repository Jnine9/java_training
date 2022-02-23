package com.scm.javatrainning.day3;

import java.util.Scanner;

/**
 * <h2>Tutorial10B Class</h2>
 * <p>
 * Process for Displaying Tutorial10B
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial10B {
	static Scanner scn;
	/**
	 * <h2>removeElementFromArray</h2>
	 * <p>
	 * Remove specified element from array.
	 * </p>
	 *
	 * @param ary     int[]
	 * @param element int
	 * @return
	 * @return int[]
	 */
	public static int[] removeElementFromArray(int[] ary, int element) {
		int[] res = new int[ary.length - 1];
		boolean check = false;
		int count = 0;
		for (int x : ary) {
			if (x == element) {
				check = true;
				continue;
			}
			try {
				res[count] = x;
				count++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Error : The given element do not match in array.");
				res = new int[0];
				break;
			}
		}
		if (!check) {
			System.out.println("Warning : " + element + " is not in the given array.");
		} else {
			System.out.println("Remove " + element + " from array successfully.");
		}
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
		int[] ary = { 1, 2, 3, 4, 5 };
		scn = new Scanner(System.in);
		boolean stop = false;
		int remover = 0;
		String userconfirm = "";
		try {
			do {
				System.out.println("Please enter an integer to remove from curret integer array : ");
				remover = scn.nextInt();
				int[] new_ary = removeElementFromArray(ary, remover);
				for (int x : new_ary) {
					System.out.println(x);
				}
				System.out.println("Do you want to test again ? (y/n)");
				userconfirm = scn.next();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			} while (!stop);
		} catch (Exception e) {
			System.out.println("Please enter a valid input.\nError : " + e.getMessage());
		}
	}
}
