package com.scm.javatrainning.day1;

/**
 * <h2>Tutorial2 Class</h2>
 * <p>
 * Process for Displaying Tutorial2 -display odd number between 1 to 10 and
 * their sum.
 * </p>
 * 
 * @author Acer
 *
 */
public class Tutorial2 {

	/**
	 * <h2>oddAndTheirSum</h2>
	 * <p>
	 * Display odd numbers and their sum.
	 * </p>
	 *
	 * @param num - integer
	 * @return void
	 */
	public static void oddAndTheirSum(int num) {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int x = (i + 1);
			if (x % 2 != 0) {
				System.out.println(x + " is odd number.");
				sum += x;
			}
		}
		System.out.println("Their sum is : " + sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oddAndTheirSum(10);
	}

}
