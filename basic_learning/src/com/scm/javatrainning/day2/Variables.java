package com.scm.javatrainning.day2;

/**
 * <h2> Variables Class</h2>
 * <p>
 * Process for Displaying Variables
 * </p>
 * 
 * @author Acer
 *
 */
public class Variables {
	//static variable
	 /**
	 * <h2> id_count</h2>
	 * <p>
	 * Default value of user_id.
	 * </p>
	 */
	static int id_count = 0;
	 
	 //non-static variable
	 String name;
	 String id;
	
	 //constructor
	 public Variables(String name) {
		 this.setName(name);
		 this.setId();
	 }
	 
	//set name
	public void setName(String name) {
		this.name = name;
	}
	
	//get name
	public String getName() {
		return this.name;
	}
	
	//set id
	public void setId() {
		this.id = this.generateId();
	}
	
	//get id
	public String getId() {
		return this.id;
	}
	
	//generate id
	public String generateId() {
		//local variable
		String id = this.getName()  + "_" + Variables.id_count;
		Variables.id_count++;
		return id;
	}
	
	public static void main(String[] args) {
		
		String name = "MgMg", name_1 = "HlaHla";
		
		Variables var = new Variables(name);
		System.out.println(var.getId());
		
		Variables var1 = new Variables(name_1);
		System.out.println(var1.getId());
	}
	
}
