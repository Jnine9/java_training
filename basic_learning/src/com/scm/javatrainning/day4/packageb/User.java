package com.scm.javatrainning.day4.packageb;

import com.scm.javatrainning.day4.packagea.Data;

/**
 * <h2> User Class</h2>
 * <p>
 * Process for Displaying User
 * </p>
 * 
 * @author Acer
 *
 */
public class User extends Data{
	/**
	 * <h2> Constructor for User </h2>
	 * <p>
	 * Constructor for User
	 * </p>
	 * @param name
	 * @param age
	 * @param address
	 */
	public User(String name,int age,String address) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);
		
	}
	
	/**
	 * <h2> getUserData</h2>
	 * <p>
	 * Get user data.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getUserData() {
		String userdata = "";
		
		for(String d : this.getAllData()) {
			userdata += d + " \n ";
		}
		
		return userdata;
	}
	
	public static void main(String[] args) {
		User user = new User("Mg Mg", 15, "Yangon");
		System.out.println(user.getUserData());
		
		User user1 = new User("Hla Hla", 17, "Mandalay");
		System.out.println(user1.getUserData());
		
		User user2 = new User("Hsu Hsu", 20, "Taunggyi");
		System.out.println(user2.getUserData());
		
		
	}
}
