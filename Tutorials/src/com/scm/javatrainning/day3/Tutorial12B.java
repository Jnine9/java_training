package com.scm.javatrainning.day3;

import java.util.HashMap;

/**
 * <h2> Tutorial12B Class</h2>
 * <p>
 * Process for Displaying Tutorial12B
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial12B {
	/**
	 * <h2> originalMap</h2>
	 * <p>
	 * originalMap.
	 * </p>
	 */
	static HashMap<String, String> originalMap;
	/**
	 * <h2> copy</h2>
	 * <p>
	 * copy
	 * </p>
	 */
	static HashMap<String, String> copy;
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
		originalMap = new HashMap<>();
		copy = new HashMap<>();
		originalMap.put("Admin ", " Mg Mg");
		originalMap.put("Developer ", " Hsu Hsu");
		originalMap.put("Client ", " Hla Hla");
		copy.putAll(originalMap);
		copy.put("System ", " Copied the original one");
		System.out.println(copy);
	}
}
