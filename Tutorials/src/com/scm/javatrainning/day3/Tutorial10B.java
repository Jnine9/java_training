package com.scm.javatrainning.day3;

import java.util.ArrayList;
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
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input
	 * </p>
	 */
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
	 * @return Object[]
	 */
	public static Object[] removeElementFromArray(int[] ary, int element) {
		ArrayList<Integer> arylist = new ArrayList<Integer>();
		int index = 0;
		boolean check = false;
		for(int i = 0; i<ary.length;i++) {
			arylist.add(ary[i]);
			if(ary[i] == element) {
				index = i;
				check = true;
			}
		}
		if(check) {
			arylist.remove(index);
			System.out.println(element + " has been removed from array.");
		} else {
			System.out.println("Warning : "+ element + " is not an element of array.\n"
					+ "Status : nothing change.");
		}
		return arylist.toArray();
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
				Object[] new_ary = removeElementFromArray(ary, remover);
				for (Object x : new_ary) {
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
