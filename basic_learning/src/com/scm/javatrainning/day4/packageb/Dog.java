package com.scm.javatrainning.day4.packageb;

import com.scm.javatrainning.day4.packagea.Animals;

/**
 * <h2> Dog Class</h2>
 * <p>
 * Process for Displaying Dog.
 * And using OOP's Inheritance.
 * </p>
 * 
 * @author Acer
 *
 */
public class Dog extends Animals{
	
	/**
	 * <h2> Constructor for Dog </h2>
	 * <p>
	 * Constructor for Dog.
	 * </p>
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
		this.setSound("Wop Wop");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println(dog.Data("dog"));
	}
}
