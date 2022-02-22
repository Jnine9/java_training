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
	 * <h2>generateAlphaPattern</h2>
	 * <p>
	 * To generate alphabet number pattern using only 1 outer and 1 inner loop.
	 * </p>
	 *
	 * @return void
	 */
	public static void generateAlphaPattern() {
		String[] alpha = { "A", "B", "C", "D", "E", "F" };
		int count = 0, space = 0, secspace = 0;
		for (int i = 0; i < 11; i++) {
			count = alpha.length - 1;
			if (i < alpha.length) {
				space = alpha.length - (i + 1);
				secspace = alpha.length + (i - 1);
			} else {
				space = (i - alpha.length) + 1;
				secspace = 9 - (i - alpha.length);
			}
			for (int k = 0; k < 11; k++) {
				if (i < alpha.length) {
					if (k >= alpha.length) {
						if (k < secspace) {
							System.out.print(" ");
						} else {
							System.out.print(alpha[count - 1]);
						}
						count--;
					} else {
						if (k > space) {
							System.out.print(" ");
						} else {
							System.out.print(alpha[k]);
						}
					}
				} else {
					if (k >= alpha.length) {
						if (k < secspace) {
							System.out.print(" ");
						} else {
							System.out.print(alpha[count - 1]);
						}
						count--;
					} else {
						if (k > space) {
							System.out.print(" ");
						} else {
							System.out.print(alpha[k]);
						}
					}
				}
			}
			System.out.println();
		}
	}
	/**
	 * <h2> generateAlphasPattern</h2>
	 * <p>
	 * To generate alphabet number pattern using only 2 outer and 3 inner loops.
	 * </p>
	 *
	 * @return void
	 */
	public static void generateAlphasPattern() {
		String[] alpha = {"A","B","C","D","E","F"};
		int markspace = 0,
				marklast = alpha.length;
		for(int i = alpha.length;i>0;i--) {
			for(int k = 0; k<i;k++) {
				System.out.print(alpha[k]);
			}
			for(int k = 1; k<markspace;k++) {
				System.out.print(" ");
			}
			markspace+=2;
			for(int k = marklast;k>0;k--) {
				if(k == alpha.length) {
					continue;
				}
				System.out.print(alpha[k-1]);
			}
			marklast --;
			System.out.println();
		}
		int mark2=7,mark3=2;
		for(int i = 1;i<alpha.length+1;i++) {
			if(i==1)
				continue;
			for(int k = 0;k<i;k++) {
				System.out.print(alpha[k]);
			}
			for(int k = mark2; k>0;k--) {
				System.out.print(" ");
			}
			mark2-=2;
			for(int k = mark3;k>0;k--) {
				if(k==alpha.length)
					continue;
				else
					System.out.print(alpha[k-1]);
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
		System.out.println();
		generateAlphaPattern();
	}
}
