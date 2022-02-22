package com.scm.javatrainning.day2;

/**
 * <h2>Tutorial7 Class</h2>
 * <p>
 * Process for Displaying Tutorial7
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial7 {
	/**
	 * <h2>generateAlphasPattern</h2>
	 * <p>
	 * To generate alphabet number pattern.
	 * </p>
	 *
	 * @return void
	 */
	public static void generateAlphasPattern() {
		int markspace = 0, marklast = 6, alpha = 65;
		for (int i = 6; i > 0; i--) {
			for (int k = 0; k < i; k++) {
				System.out.print("" + (char) (alpha + k));
			}
			for (int k = 1; k < markspace; k++) {
				System.out.print(" ");
			}
			markspace += 2;
			for (int k = marklast; k > 0; k--) {
				if (k == 6)
					continue;
				else
					System.out.print("" + (char) (alpha + (k - 1)));
			}
			marklast--;
			System.out.println();
		}
		int mark2 = 7, mark3 = 2;
		for (int i = 1; i < 6 + 1; i++) {
			if (i == 1)
				continue;
			for (int k = 0; k < i; k++) {
				System.out.print("" + (char) (65 + k));
			}
			for (int k = mark2; k > 0; k--) {
				System.out.print(" ");
			}
			mark2 -= 2;
			for (int k = mark3; k > 0; k--) {
				if (k == 6)
					continue;
				else
					System.out.print("" + (char) (alpha + (k - 1)));
			}
			mark3++;
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
		generateAlphasPattern();
	}
}
