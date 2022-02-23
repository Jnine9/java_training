package com.scm.javatrainning.day3;

/**
 * <h2> Tutorial10A Class</h2>
 * <p>
 * Process for Displaying Tutorial10A
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial10A {
	/**
	 * <h2> calaulateAverage</h2>
	 * <p>
	 * Calculate average value of an array.
	 * </p>
	 *
	 * @param ary int[]
	 * @return void
	 */
	public static void calaulateAverage(int[] ary) {
		float sum = 0,
				count = 0;
		for(float x : ary) {
			sum += x;
			count ++;
		}
		float res = sum/count;
		System.out.println(""+res);
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
		int[] ary = {3,4,5,7,9};
		calaulateAverage(ary);
	}
}
