package com.scm.javatrainning.day4.packagea;

/**
 * <h2> AccessModifier Class</h2>
 * <p>
 * Process for Displaying AccessModifier.<br>
 * -Simple OBJECT-ORIENTED CONCEPT.<br>
 * -Using OOP's encapsulation.
 * </p>
 * 
 * @author Sai Zaw Myint
 *
 */
public class Data {
	protected static int id_count = 0;
	private String name;
	public int age;
	protected int id;
	String address;
	
	/**
	 * <h2> Constructor for Data </h2>
	 * <p>
	 * Simple OOP's encapsulation class and access modifier usages.
	 * </p>
	 */
	public Data() {
		// TODO Auto-generated constructor stub
		generateID();
	}
	
	/**
	 * <h2> generateID</h2>
	 * <p>
	 * Generate user id.
	 * </p>
	 *
	 * @return void
	 */
	private void generateID() {
		this.id = Data.id_count;
		Data.id_count++;
	}
	
	/**
	 * <h2> getName</h2>
	 * <p>
	 *  Get user name.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * <h2> setName</h2>
	 * <p>
	 *  Set user name
	 * </p>
	 *
	 * @param name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <h2> getAge</h2>
	 * <p>
	 * 	Get user age.
	 * </p>
	 *
	 * @return
	 * @return int
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <h2> setAge</h2>
	 * <p>
	 *  Set user age.
	 * </p>
	 *
	 * @param age
	 * @return void
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * <h2> getId</h2>
	 * <p>
	 *  Get user id.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * <h2> getAddress</h2>
	 * <p>
	 * Get user address.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <h2> setAddress</h2>
	 * <p>
	 * Set user address.
	 * </p>
	 *
	 * @param address
	 * @return void
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String[] getAllData() {
		String[] data = new String[4];
		data[0] = "Name : "+this.getName();
		data[1] = "Age : "+this.getAge();
		data[2] = "Address : " + this.getAddress();
		data[3] = "ID : " + this.getId();
		return data;
	}

}
