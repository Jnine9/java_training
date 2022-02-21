package com.scm.javatrainning.day1;

/**
 * <h2>Tutorial5 Class</h2>
 * <p>
 * Process for Displaying Tutorial5. -To generate a *'s right angle triangle.
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial5 {

	/**
	 * <h2>generatePattern</h2>
	 * <p>
	 * To generate a *'s right angle triangle with size.
	 * </p>
	 *
	 * @param size int
	 * @return void
	 */
	public static void generatePattern(int size) {
		String out = "";
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < size; k++) {
				if (k < i) {
					out = " ";
				} else {
					out = "*";
				}
				System.out.print(out);
			}
			System.out.println();
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
		generatePattern(6);
	}

}
