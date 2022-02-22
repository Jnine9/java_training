package com.scm.javatrainning.day2;

/**
 * <h2>Tutorial6 Class</h2>
 * <p>
 * Process for Displaying Tutorial6
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial6 {
	/**
	 * <h2>generatePatern</h2>
	 * <p>
	 * To generate numbers pattern by given size.
	 * </p>
	 *
	 * @param size int
	 * @return void
	 */
	public static void generatePatern(int size) {
		int count = size - 2;
		String out = "";
		for (int i = 0; i < (size * 2) - 1; i++) {
				for (int k = 0; k < size; k++) {
					if(i<size) {
						if (k < i) {
							out = " ";
						} else {
							out = (k + 1) + " ";
						}
						System.out.print(out);
					}else {
						if (k < count) {
							out = " ";
						} else {
							out = (k + 1) + " ";
						}
						System.out.print(out);
					}
				}
			if(i >= size) {
				count --;
			}
			System.out.println();
		}
	}
	/**
	 * <h2>main</h2>
	 * <p>
	 * Main method to run project.
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		generatePatern(7);
	}
}
