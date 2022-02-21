package com.scm.javatrainning.day1;

/**
 * <h2>Tutorial4 Class</h2>
 * <p>
 * Process for Displaying Tutorial4. -To display the pattern like right angle
 * triangle.
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial4 {
	/**
	 * <h2>displayEvenPattern</h2>
	 * <p>
	 * To display the pattern like right angle triangle.
	 * </p>
	 *
	 * @param num int
	 * @return void
	 */
	public static void displayEvenPattern(int num) {
		int x = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++) {
				x = j + 1;
				if (x % 2 == 0 || x == 1) {
					System.out.print(x);
					if (x != 1) {
						System.out.print(" ");
					}
				}
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
		displayEvenPattern(10);
	}
}
