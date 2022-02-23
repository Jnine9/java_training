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
	static HashMap<String, String> myMap;
	static Scanner scn;
	/**
	 * <h2> isKeyExist</h2>
	 * <p>
	 * Check key exist or not.
	 * </p>
	 *
	 * @param map HashMap<String, String>
	 * @param key String
	 * @return
	 * @return boolean
	 */
	public static boolean isKeyExist(HashMap<String, String> map ,String key) {
		return map.containsKey(key);
	}
	/**
	 * <h2> getValue</h2>
	 * <p>
	 * Get map value by specific key.
	 * </p>
	 *
	 * @param map HashMap<String, String>
	 * @param key String
	 * @return
	 * @return String
	 */
	public static String getValue(HashMap<String, String>map,String key) {
		return map.get(key);
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
				res = isKeyExist(myMap, key) ? "Key exist. Key's value is :  " + getValue(myMap, key) : 
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
