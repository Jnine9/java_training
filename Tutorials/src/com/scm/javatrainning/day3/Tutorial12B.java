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
	 * Copy hash map.
	 * </p>
	 *
	 * @param original HashMap<String, String>
	 * @return
	 * @return HashMap<String,String>
	 */
	public static HashMap<String,String> copy(HashMap<String, String>original) {
		HashMap<String, String> copy = new HashMap<>();
		copy.putAll(original);
		return copy;
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
		originalMap = new HashMap<>();
		originalMap.put("Admin ", " Mg Mg");
		originalMap.put("Developer ", " Hsu Hsu");
		originalMap.put("Client ", " Hla Hla");
		HashMap<String, String> copy = copy(originalMap);
		copy.put("System ", " Copied the original one");
		System.out.println(copy);
	}
}
