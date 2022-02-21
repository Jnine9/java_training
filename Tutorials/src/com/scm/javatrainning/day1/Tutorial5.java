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
	 * @param size - integer
	 * @return void
	 */
	public static void generatePattern(int size) {
		for (int i = 0; i < size; i++) {
			for (int k = 0; k < size; k++) {
				String out = "";
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generatePattern(6);
	}

}
