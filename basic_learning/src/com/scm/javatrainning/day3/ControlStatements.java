package com.scm.javatrainning.day3;

public class ControlStatements {

	//if else condition
	static boolean isDataExist(String[] obj) {
		boolean result = false;
			
		if(obj.length <= 0) {
			result = false;
		}else {
			result = true;
		}
		
		return result;
	}
	
	//nested if condition
	static String getUserType(String user) {
		String result = "";
		
		if(user.equals("Mg Mg")) {
			result = "Admin";
		}else if(user.equals("Hsu Hsu")) {
			result = "Developer";
		}else {
			result = "Client";
		}
		
		return result;
	}
	
	//Access user with switch case condition
	static String giveUserAccess(String name) {
		String result = "";
		
		switch(name) {
		case "Mg Mg":
			result = name + ", now can access as Admin.\n";
			break;
			
		case "Hsu Hsu":
			result = name + ", now can access as Developer.\n";
			break;
			
		default:
			result = name + ", now can access as Client.\n";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String[] data = {"Mg Mg","Hla Hla","Hsu Hsu","Htet Htet"};
		
		//check data by using if else condition 
		if(isDataExist(data)) {
			System.out.println("Data Exist !\n");
		}else {
			System.out.println("No Data Found !!\n");
		}
		
		/*
		 * Get user type
		 * using for each loop and nested if condition
		 */
		
		for(String user : data) {
			System.out.println(user + " is " + getUserType(user) + ".");
			/*
			 * Give access to user
			 * using switch case
			 */
			System.out.println(giveUserAccess(user));
		}
		
	}
	
}
