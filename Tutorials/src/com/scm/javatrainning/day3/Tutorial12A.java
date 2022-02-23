package com.scm.javatrainning.day3;

import java.util.HashMap;

/**
 * <h2> Tutorial12A Class</h2>
 * <p>
 * Process for Displaying Tutorial12A
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial12A {
	/**
	 * <h2> my_map</h2>
	 * <p>
	 * my_map - my hash map.
	 * </p>
	 */
	static HashMap<String, String> my_map;
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
		my_map = new HashMap<>();
		my_map.put("Admin", "Mg Mg");
		my_map.put("Client", "Hla Hla");
		System.out.println(my_map);
	}
}
