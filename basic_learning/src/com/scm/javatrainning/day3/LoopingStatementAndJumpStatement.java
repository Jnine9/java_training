package com.scm.javatrainning.day3;

public class LoopingStatementAndJumpStatement {
	static String[] weekDay = { "Sunday", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday" };

	static String getDayNameByNum(int num) {
		String result = "";

		result = weekDay[num - 1];

		return result;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("All day in week :");
		// get day for loop
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ". " + getDayNameByNum(num[i]));
		}
		
		System.out.println("\nWork day in a week : ");
		//Get word day, skip weekend days using for each loop
		for(int i : num) {
			if(i == 1 || i == 7) {
				continue;
			}
			System.out.println(getDayNameByNum(i));
		}
		
		//Plan day with while loop
		System.out.println("\nWe have plan on these day : ");
		int countplanday = 3;
		while(countplanday < 7) {
			if(countplanday == 5) {
				break;
			}
			System.out.println(getDayNameByNum(num[countplanday]));
			countplanday ++;
		}
		
		//do while loop
		System.out.println("\nWe have School on these day : ");
		int countschoolday = 1;
		do {
			System.out.println(getDayNameByNum(num[countschoolday]));
			countschoolday++;
		}while(countschoolday < 6);
		
	}

}
