package com.scm.javatrainning.day2;

/**
 * <h2> DataType Class</h2>
 * <p>
 * Process for Displaying DataType
 * </p>
 * 
 * @author Sai Zaw Myint
 *
 */
public class DataType implements NonPrimitiveDataTypeInterface{
	//object of data type 
	String animal, data;
	/**
	 * <h2> Constructor for DataType </h2>
	 * <p>
	 * Constructor for DataType
	 * </p>
	 * @param animal
	 */
	public DataType(String animal) {
		this.animal(animal);
		this.sound();
	}
	
	/**
	 * <h2> main</h2>
	 * <p>
	 * Main method.
	 * </p>
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Primitive data types to
		 * line 40
		 */
		byte byts = 100;
		System.out.println(byts);
		
		short sht = 5000;
		System.out.println(sht);
		
		int intNum = 1000000000;
		System.out.println(intNum);
		
		long longNum = 1500000000000L;
		System.out.println(longNum);
		
		float floatNum_1 = 2.15f;
		System.out.println(floatNum_1);
		
		//another of float can be use as
		float floatNum = 35e5f;
		System.out.println(floatNum);
		
		double doubleNum = 19.99d;
		System.out.println(doubleNum);
		
		//another of double can be us as
		double doubleNum_1 = 67E5d;
		System.out.println(doubleNum_1);
		
		boolean exit = true;
		
		char charNum = 'a';
		System.out.println(charNum);
		
		/*
		 * Non-primitive data types
		 * see bellow
		 */
		//String 
		String checkExit = "";
		checkExit = exit ? "It's exit.":"It's not exit.";
		System.out.println(checkExit);
		
		//test interface
		DataType dt = new DataType("Cat");
		System.out.println(dt.getSound());
		
		//array 
		String[] ary = {"Hello","World"};
		System.out.println(ary[0]+" "+ary[1]);
		
		//object
		System.out.println(dt.animal);
		
	}
	
	//get animal sound
	/**
	 * <h2> getSound</h2>
	 * <p>
	 * Get animal sound.
	 * </p>
	 *
	 * @return
	 * @return String
	 */
	public String getSound() {
		return this.data;
	}
	
	@Override
	public void animal(String animal) {
		// TODO Auto-generated method stub
		this.animal = animal;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		this.data = (this.animal + " has no sound in out data. Come back later.");
	}

}
