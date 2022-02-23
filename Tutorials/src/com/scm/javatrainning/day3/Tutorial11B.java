package com.scm.javatrainning.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * <h2> Tutorial11B Class</h2>
 * <p>
 * Process for Displaying Tutorial11B
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial11B {
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input.
	 * </p>
	 */
	static Scanner scn;
	/**
	 * <h2> my_array</h2>
	 * <p>
	 * my_array : my list.
	 * </p>
	 */
	static ArrayList<String> my_array;
	/**
	 * <h2> SwapLists</h2>
	 * <p>
	 * Swap specified lists in my list. 
	 * </p>
	 *
	 * @param lists ArrayList<String>
	 * @param list1 String
	 * @param list2 String
	 * @return void
	 */
	public static void SwapLists(ArrayList<String> lists,String list1,String list2) {
		int index1=0,index2=0;
		boolean check1 = false,check2 = false;
		String mark = "";
		for(int i = 0; i<lists.size();i++) {
			mark = lists.get(i);
			if(mark.equalsIgnoreCase(list1.trim())) {
				index1 = i;
				check1 = true;
			}
			if(mark.equalsIgnoreCase(list2.trim())) {
				index2 = i;
				check2 = true;
			}
		}
		if(!check1) {
			System.out.println("Warnning : "+list1+" not found !");
		}else if(!check2) {
			System.out.println("Warnning : "+list2+" not found !");
		}else {
			Collections.swap(lists, index1, index2);
			System.out.println(list1.trim() + " swap to "+(index2+1)+" and "+list2.trim() + "swap to " + (index1+1) + ".");
			for(String x : lists) {
				System.out.println(x);
			}
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
		my_array = new ArrayList<>();
		my_array.add("Red");
		my_array.add("Green");
		my_array.add("Black");
		my_array.add("White");
		my_array.add("Pink");
		boolean stop = false;
		String userconfirm = "",
				list1 = "",
				list2 = "";
		try {
			do {
				System.out.println("My current list is : ");
				for(String x : my_array) {
					System.out.println(x);
				}
				System.out.println("Let's swap some list !!!");
				System.out.println("Enter first list to swap : ");
				list1 = scn.nextLine();
				System.out.println("Enter second list to swap : ");
				list2 = scn.nextLine();
				SwapLists(my_array, list1, list2);
				System.out.println("Do you want to test again ? (y/n)");
				userconfirm = scn.nextLine();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			}while(!stop);
		}catch(Exception e) {
			System.out.println("Please enter a valid input.\nEorror : "+e.getMessage());
		}
	}
}
