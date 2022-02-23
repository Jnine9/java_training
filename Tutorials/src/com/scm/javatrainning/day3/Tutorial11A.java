package com.scm.javatrainning.day3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h2> Tutorial11A Class</h2>
 * <p>
 * Process for Displaying Tutorial11A
 * </p>
 * 
 * @author SaiZawMyint
 *
 */
public class Tutorial11A {
	/**
	 * <h2> scn</h2>
	 * <p>
	 * User input
	 * </p>
	 */
	private Scanner scn;
	/**
	 * <h2> myList</h2>
	 * <p>
	 * My lists.
	 * </p>
	 */
	private ArrayList<String> myList;
	/**
	 * <h2> Constructor for Tutorial11A </h2>
	 * <p>
	 * Constructor for Tutorial11A
	 * </p>
	 */
	public Tutorial11A() {
		myList = new ArrayList<>();
		scn = new Scanner(System.in);
	}
	/**
	 * <h2> addList</h2>
	 * <p>
	 * Add list to my lists.
	 * </p>
	 *
	 * @param list String
	 * @return void
	 */
	public void addList(String list) {
		this.myList.add(list);
	}
	/**
	 * <h2> getMyList</h2>
	 * <p>
	 * Get all my current list.
	 * </p>
	 *
	 * @return
	 * @return ArrayList<String>
	 */
	public ArrayList<String> getMyList(){
		return this.myList;
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
		Tutorial11A myList = new Tutorial11A();
		ArrayList<String> lists = new ArrayList<>();
		boolean stop = false;
		String userconfirm = "",
				list = "";
		int count = 0;
		try {
			do {
				System.out.println("Enter your list : ");
				list = myList.scn.nextLine();
				myList.addList(list);
				lists = myList.getMyList();
				count = 1;
				for(String str : lists) {
					System.out.println("("+count+") "+str);
					count++;
				}
				System.out.println("Add new list ? (y/n)");
				userconfirm = myList.scn.nextLine();
				stop = userconfirm.equalsIgnoreCase("y") ? false : true;
			}while(!stop);
		}catch(Exception e) {
			System.out.println("Please enter a valid input.\nError : "+ e.getMessage());
		}
	}
}
