package com.scm.javatrainning.day4.packageb;

/**
 * <h2>PolymorphismExample Class</h2>
 * <p>
 * Process for Displaying PolymorphismExample. -Using OOP's Polymorphism method.
 * </p>
 * 
 * @author Acer
 *
 */
public class PolymorphismExample {
	
	/**
	 * <h2> showOverloadingAction</h2>
	 * <p>
	 * Show overloading action.
	 * </p>
	 *
	 * @return void
	 */
	void showOverloadingAction() {
		Overloading loading = new Overloading();
		loading.showAction();
	}
	
	/**
	 * <h2> showOverridingAction</h2>
	 * <p>
	 * Show overriding action.
	 * 
	 * </p>
	 *
	 * @return void
	 */
	void showOverridingAction() {
		Overriding override = new Overriding();
		override.showAction();
	}
	
	/**
	 * <h2> Overloading Class</h2>
	 * <p>
	 * Process for Displaying Overloading.
	 * -Using Polymorphism's overloading
	 * </p>
	 * 
	 * @author Acer
	 *
	 */
	class Overloading{
		
		void showAction() {
			Complier comp = new Complier();
			comp.showData();
		}
		/**
		 * <h2> Data Class</h2>
		 * <p>
		 * Process for Displaying Data
		 * </p>
		 * 
		 * @author Acer
		 *
		 */
		class Data {
			/**
			 * <h2> addData</h2>
			 * <p>
			 *  Adding tow String
			 * </p>
			 *
			 * @param data1
			 * @param data2
			 * @return void
			 */
			void addData(String data1,String data2) {
				System.out.println(data1 + data1);
			}
			/**
			 * <h2> addData</h2>
			 * <p>
			 * Adding tow String
			 * </p>
			 *
			 * @param data1
			 * @param data2
			 * @return void
			 */
			void addData(int data1,int data2) {
				System.out.println(data1 + data1);
			}
			/**
			 * <h2> addData</h2>
			 * <p>
			 * Adding String and int
			 * </p>
			 *
			 * @param data1
			 * @param data2
			 * @return void
			 */
			void addData(String data1,int data2) {
				System.out.println(data1 + data1);
			}
		}
		
		/**
		 * <h2> Complier Class</h2>
		 * <p>
		 * Process for Displaying Complier.
		 * 
		 * </p>
		 * 
		 * @author Acer
		 *
		 */
		class Complier extends Data{
			void showData() {
				this.addData(10, 5);
				this.addData("String : ", 5);
				this.addData("String 1 + ", "String 2");
			}
		}
		
	}
	
	/**
	 * <h2> Overridding Class</h2>
	 * <p>
	 * Process for Displaying Overriding
	 * </p>
	 * 
	 * @author Acer
	 *
	 */
	class Overriding{
		
		void showAction() {
			Circle c = new Circle();
			c.circle();
		}
		
		class shape{
			void circle() {
				System.out.println("I'm circle");
			}
		}
		class Circle extends shape{
			void circle() {
				System.out.println("I'm circle form circle class.");
			}
		}
	}
	
	public static void main(String[] args) {
		PolymorphismExample pme = new PolymorphismExample();
		System.out.println("Overloading Action : ");
		pme.showOverloadingAction();
		System.out.println("\nOverriding Action : ");
		pme.showOverridingAction();
	}
		
}
