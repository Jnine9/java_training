package com.scm.javatrainning.day3;

import java.util.Scanner;

/**
 * <h2> Palindrome Class</h2>
 * <p>
 * Process for Displaying Palindrome
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Palindrome {
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input.
	 * </p>
	 */
	static Scanner scn;
	/**
	 * <h2> determinePalindrome</h2>
	 * <p>
	 * Determine whether given string is palindrome or not.
	 * </p>
	 *
	 * @param str String
	 * @return void
	 */
	public static void determinePalindrome(String str) {
		int strlen = str.length();
		String evenorodd = strlen%2 == 0 ? "even" : "odd";
		int seperator = evenorodd.equals("even") ? 0 : 1;
		String first = str.substring(0,strlen/2);
		String last = str.substring((strlen/2) + seperator , str.length());
		StringBuilder sb = new StringBuilder(last);
		sb.reverse();
		last = sb.toString();
		if(first.equals(last)) {
			System.out.println(str + " is a palindrome.");
		}else {
			System.out.println(str + " is not a palindrome.");
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
		scn = new Scanner(System.in);
		boolean stop = false;
		String userconfirm = "",
				str = "";
		do {
			System.out.println("Enter a String : ");
			str = scn.nextLine();
			determinePalindrome(str);
			System.out.println("Do you want to do more? (y/n)");
			userconfirm = scn.nextLine();
			stop = userconfirm.equalsIgnoreCase("y") ? false: true;
		}while(!stop);
	}
}
