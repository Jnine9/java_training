package com.scm.javatrainning.day3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <h2> Tutorial10C Class</h2>
 * <p>
 * Process for Displaying Tutorial10C
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial10C {
	static Scanner scn;
	/**
	 * <h2> convertListToArray</h2>
	 * <p>
	 * Convert Array list to array.
	 * </p>
	 *
	 * @param ary ArrayList<String>
	 * @return
	 * @return String[]
	 */
	public static String[] convertListToArray(ArrayList<String> ary) {
		String[] res = new String[ary.size()];
		ary.toArray(res);
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
		scn = new Scanner(System.in);
		ArrayList<String> my_array = new ArrayList<>();
		boolean stop = false;
		String userconfirm = "",
				list = "";
		try {
			do {
				System.out.println("Enter your list : ");
				list = scn.nextLine();
				my_array.add(list);
				System.out.println("Add another list ? (y/n)");
				userconfirm = scn.nextLine();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			}while(!stop);
			String[] result = convertListToArray(my_array);
			for(String x : result) {
				System.out.println(x);
			}	
		}catch(InputMismatchException e) {
			System.out.println("Please enter a valid input.");
		}
	}
}
