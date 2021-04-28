package math;


import org.junit.Test;
import math.MyMath;


/**
* This class provides test cases for the 
* MyMath class, for demonstrating Unit Testing.
* @author  nikiboura
*/


public class MyMathTest {
	
	/* 
	 * A reference to the MyMath class
	 * whose methods we are testing in this class.
	 */
	 MyMath mm = new MyMath();
		
		/*
		 * A test case for the factorial method
		 * for the exception caused 
		 * when the input number is negative.
		 */ 
		@Test (expected = IllegalArgumentException.class)
	    public void test_Factorial_Should_Throw_An_Exception_If_Negative() {
	    	mm.factorial(-1);
	    } 
			
		/*
		 * A test case for the factorial method
		 * for the exception caused 
		 * when the input number is greater than 12.
		 */ 
		@Test (expected = IllegalArgumentException.class)
	    public void test_Factorial_Should_Throw_An_Exception_If_Greater() {
	    	mm.factorial(14);
	    } 
}
