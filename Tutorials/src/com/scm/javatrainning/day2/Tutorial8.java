package com.scm.javatrainning.day2;

/**
 * <h2> Tutorial8 Class</h2>
 * <p>
 * Process for Displaying Tutorial8
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial8 {
	/**
	 * <h2> generateNumPattern</h2>
	 * <p>
	 * Generate alphabet pattern.
	 * </p>
	 *
	 * @return void
	 */
	public static void generateNumPattern() {
		
		int result = 0,alpha = 65;
		for(int i = 0;i<10;i++) {
			if(i==9) {
				System.out.print((char)(alpha + i - 1)+" ");
			}else {
				for(int k = 1;k<=i;k++) {
					result = k*i;
					if(result<=alpha && i+result <= 30) {
						System.out.print((char)(alpha + result - 1)+" ");
					}
				}
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
		generateNumPattern();
	}

}
