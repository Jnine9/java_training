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
	private HashMap<String, String> my_map;
	/**
	 * <h2> Constructor for Tutorial12A </h2>
	 * <p>
	 * Constructor for Tutorial12A
	 * </p>
	 */
	public Tutorial12A() {
		my_map = new HashMap<String,String>();
	}
	/**
	 * <h2> getMyMap</h2>
	 * <p>
	 * Get my hash map.
	 * </p>
	 *
	 * @return
	 * @return HashMap<String,String>
	 */
	public HashMap<String, String> getMyMap() {
		return my_map;
	}
	/**
	 * <h2> addValue</h2>
	 * <p>
	 * Add new key and value to my hash map.
	 * </p>
	 *
	 * @param key String
	 * @param value String
	 * @return void
	 */
	public void addValue(String key,String value) {
		this.my_map.put(key, value);
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
		Tutorial12A hashmap = new Tutorial12A();
		hashmap.addValue("Admin", "Mg Mg");
		hashmap.addValue("Client", "Hla Hla");
		System.out.println(hashmap.getMyMap());
	}
}
