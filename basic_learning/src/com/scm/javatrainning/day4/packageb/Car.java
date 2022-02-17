package com.scm.javatrainning.day4.packageb;

import com.scm.javatrainning.day4.packagea.Behavior;
import com.scm.javatrainning.day4.packagea.Vechicle;

/**
 * <h2> Car Class</h2>
 * <p>
 * Process for Displaying Car
 * </p>
 * 
 * @author Acer
 *
 */
public class Car extends Vechicle implements Behavior{
	
	private String type;
	private boolean ridable;
	
	/**
	 * <h2> Constructor for Car </h2>
	 * <p>
	 * Constructor for Car
	 * </p>
	 */
	public Car() {
		// TODO Auto-generated constructor stub
		this.type("car");
		this.ridAble(true);
	}
	
	/**
	 * <h2> isRidAble</h2>
	 * <p>
	 * Check ride able.
	 * </p>
	 *
	 * @return
	 * @return boolean
	 */
	public boolean isRidAble() {
		return this.ridable;
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		String data = car.isRidAble() ? car.type + " is ridable.\n" : car.type + "is not ridable.";
		System.out.println(data);
	}
	
	@Override
	public void type(String name) {
		// TODO Auto-generated method stub
		this.type = name;
	}

	@Override
	public void ridAble(boolean ridable) {
		// TODO Auto-generated method stub
		this.ridable = ridable;
	}

	


}
