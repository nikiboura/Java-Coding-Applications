package math;


import org.junit.Assert;
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
		 * A test case for the Factorial method
		 * with normal input
		 */ 
		@Test
	    public void test_Factorial_Normal() {
			Assert.assertEquals(6,mm.factorial(3));
			Assert.assertEquals(1,mm.factorial(0));
			Assert.assertEquals(479001600,mm.factorial(12));
	    } 
		
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
		
		/*
		 * A test case for the isPrime method
		 * for the exception caused 
		 * when the input number is not greater than 2
		 */ 
		@Test (expected = IllegalArgumentException.class)
	    public void test_isPrime_Should_Throw_An_Exception_If_Greater() {
	    	mm.isPrime(1);
	    	mm.isPrime(2);
	    } 
		
		/*
		 * A test case for the isPrime method
		 * with normal input
		 */ 
		@Test
	    public void test_isPrime_Normal() {
			Assert.assertEquals(true,mm.isPrime(7));
			Assert.assertEquals(false,mm.isPrime(10));
	    } 
		
}

