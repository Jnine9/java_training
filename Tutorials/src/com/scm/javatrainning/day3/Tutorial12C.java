package com.scm.javatrainning.day3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * <h2> Tutorial12C Class</h2>
 * <p>
 * Process for Displaying Tutorial12C
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial12C {
	/**
	 * <h2> myMap</h2>
	 * <p>
	 * myMap Hash Map.
	 * </p>
	 */
	static HashMap<String, String> myMap;
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input.
	 * </p>
	 */
	static Scanner scn;
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
		myMap = new HashMap<>();
		myMap.put("Admin", "Mg Mg");
		myMap.put("Client", "Hla Hla");
		scn = new Scanner(System.in);
		String key = "",
				res = "",
				userconfirm = "";
		boolean stop = false;
		try {
			do {
				System.out.println("Enter key to check if key exist in myMap : ");
				key = scn.nextLine();
				res = myMap.containsKey(key) ? "Key exist. Key's value is :  " + myMap.get(key) : 
					"Key doesn't exist!!!";
				System.out.println(res);
				System.out.println("Do you want to check again ? (y/n)");
				userconfirm = scn.nextLine();
				stop = userconfirm.equalsIgnoreCase("y") ? false: true;
			}while(!stop);
		}catch(Exception e) {
			System.out.println("Please enter a valid input.\nError : " + e.getMessage());
		}
	}
}
