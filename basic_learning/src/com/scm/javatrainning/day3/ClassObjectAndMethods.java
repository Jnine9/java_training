package com.scm.javatrainning.day3;

public class ClassObjectAndMethods {
	// static
	static String admin = "Mg Mg";
	static Data data;

	// non-static
	String name;

	// default constructor
	public ClassObjectAndMethods() {

	}

	// Parameterize constructor
	public ClassObjectAndMethods(String name) {
		setName(name);
	}

	// Check admin (static method)
	static boolean isAdmin(String name) {
		boolean result = false;
		// equals(String) is predefined methods
		result = name.equals(admin) ? true : false;
		return result;
	}

	// user-defined method (non-static method)
	public void setName(String name) {
		this.name = name;
		
	}

	public void setData(String str) {
		data = new Data();
		data.setData(this.name + " : " + str);
	}

	// get data
	static public String getData() {
		return Data.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Usage of default parameter
		ClassObjectAndMethods clo = new ClassObjectAndMethods();
		clo.setName("Mg Mg");

		// Usage of parameterized constructor
		ClassObjectAndMethods clo_para = new ClassObjectAndMethods("Hla Hla");

		// usage of default constructor
		if (ClassObjectAndMethods.isAdmin(clo.name)) {
			System.out.println(clo.name + " is an Admin.");
			clo.setData("Admin");
		} else {
			System.out.println(clo.name + " is not an Admin.");
			clo.setData("Client");
		}

		// usage of parameterized constructor
		if (ClassObjectAndMethods.isAdmin(clo_para.name)) {
			System.out.println(clo_para.name + " is an Admin.");
			clo_para.setData("Admin");
		} else {
			System.out.println(clo_para.name + " is not an Admin.");
			clo_para.setData("Client");
		}

		//All Data of user 
		System.out.println(getData());

	}

	// nested class extend abstract class user
	class Data extends User {
		static String data = "";

		@Override
		public void setData(String dat) {
			// TODO Auto-generated method stub
			data += " * " + dat + "\n";
		}

	}

	// Use nested class to defined abstract method
	abstract class User {
		// abstract method
		public abstract void setData(String data);
	}
}
