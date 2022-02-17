package com.scm.javatrainning.day2;

/**
 * <h2> Operator Class</h2>
 * <p>
 * Process for Displaying Operator
 * </p>
 * 
 * @author Acer
 *
 */
public class Operator {
	
	int x, y;
	/**
	 * <h2> Constructor for Operator </h2>
	 * <p>
	 * Constructor for Operator
	 * </p>
	 * @param x
	 * @param y
	 */
	public Operator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * <h2> arithmeticOperator</h2>
	 * <p>
	 * Get Arithmetically result 
	 * </p>
	 *
	 * @param getResultBy
	 * @return
	 * @return int
	 */
	public int arithmeticOperator(String getResultBy) {
		
		int result = 0;
		
		//specify result by using ternary operator
		result = getResultBy == "addition" ? this.x + this.y : 
			getResultBy == "subtraction" ? this.x - this.y:
				getResultBy == "multiplication" ? this.x * this.y: 
					getResultBy == "division" ? this.x / this.y:
					getResultBy == "modulus" ? this.x % this.y:
						//this is also call unary operator
						getResultBy == "incrementOfX" ? (++this.x) :
							//this is also call unary operator
							getResultBy=="decrementOfY"? (--this.y):
								0;

		return result;
	}
	
	
	/**
	 * <h2> assignmentOperator</h2>
	 * <p>
	 * get result by assignment operator
	 * </p>
	 *
	 * @param example
	 * @return
	 * @return int
	 */
	public int assignmentOperator(String example) {
		int result = 0;
		
		//specify result by using ternary operator
		result = example == "=" ? 
				(this.x == this.y ? 1 : 0) :
					example == "+=" ? (this.x += this.y):
						example == "-=" ? (this.x -= this.y):
							example == "*=" ? (this.x *= this.y):
								example == "/=" ? (this.x /= this.y):
									example == "%=" ? (this.x %= this.y):
										example == "&=" ? (this.x &= this.y):
											example == "|=" ? (this.x |= this.y):
												example == "^=" ? (this.x^= this.y):0;
		
		return result;
	}
	
	/**
	 * <h2> logicalOperator</h2>
	 * <p>
	 * get result by logical operator
	 * Relational operator is same as logical operator
	 * </p>
	 *
	 * @param logic
	 * @return
	 * @return boolean
	 */
	public boolean logicalOperator(String logic) {
		boolean result = false;
		
		//specify result by using ternary operator
		result = logic == "==" ? (this.x == this.y ? true: false) : 
			logic == "!=" ? (this.x != this.y ? true: false) : 
				logic == "<=" ? (this.x <= this.y ? true: false) : 
					logic == ">=" ? (this.x >= this.y ? true: false) : 
						logic == "<" ? (this.x < this.y ? true: false) : 
							logic == ">" ? (this.x > this.y ? true: false) : 
			false;
		
		return result;
	}
	
	
	/**
	 * <h2> instaceOfOperator</h2>
	 * <p>
	 * use instanceOf operator to check number is integer
	 * </p>
	 *
	 * @param check
	 * @return
	 * @return String
	 */
	public String instaceOfOperator(Object check) {
		String result = "";
			result = (check instanceof String) ? check + " is String.":
				(check instanceof Integer) ? check + " is integer." : "";
			
		return result;
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
		Operator opr = new Operator(10, 5);
		
		//arithmetic operator 
		System.out.println("Add tow numbers : " + opr.arithmeticOperator("addition"));
		System.out.println("Subtract two numbers : " + opr.arithmeticOperator("subtraction"));
		System.out.println("Multiply two numbers : " + opr.arithmeticOperator("multiplication"));
		
		//assignment operator
		System.out.println("AssignmentOperator : " + opr.assignmentOperator("/="));
		
		//logical operator
		System.out.println("Check numbers by logical operator : " + opr.logicalOperator("=="));
		
		//instance of operator
		System.out.println("Check parameter type : " + opr.instaceOfOperator(0));
	}

}
