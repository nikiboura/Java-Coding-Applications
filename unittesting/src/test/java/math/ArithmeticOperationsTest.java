package math;

import math.ArithmeticOperations;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
* This class provides test cases for the 
* ArithmeticOperations class, for demonstrating Unit Testing.
* @author  nikiboura
*/
public class ArithmeticOperationsTest {
	/* 
	 * A reference to the ArithmeticOperations class
	 * whose methods we are testing in this class.
	 */
	ArithmeticOperations ap = new ArithmeticOperations();
	
	/*
	 * A test case for the divide method
	 * with normal inputs
	 */ 
	 @Test
		public void test_Divide_Normal() {
			Assert.assertEquals(6.0, ap.divide(12.0, 2.0),0.01);
		} 
	
	/*
	 * A test case for the divide method
	 * for the exception caused when the denominator 
	 * in the division is  zero.
	 */ 
	 @Test (expected = ArithmeticException.class)
	    public void test_Divide_Should_Throw_Exception() {
	    	ap.divide(3,0);
	    } 
	 
	 /*
	  * A test case for the multiple method
	  * with normal inputs
	  */ 
	  @Test
		 public void test_Multiply_Normal() {
			 Assert.assertEquals(6, ap.multiply(3, 2));
		 } 
 
	 /*
	  * A test case for the multiple method
	  * for the exception caused when x or y are negative 
	  * and when the result of the multiplication can not fin an integer value.
	  * the exception is performed with a @Rule
	  */ 
	 @Rule 
	 	//initialize it to .none()
		public ExpectedException thrown = ExpectedException.none(); 
	 
		@Test 
		public void test_Multiply_Should_Throw_Exception_If_Negative() {
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("x & y should be >= 0");
			ap.multiply(-2, 1);
			ap.multiply(2, -1);	
		}
		
		
		@Test 
		public void test_Multiply_Should_Throw_Exception_OverFlow() {
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("The product does not fit in an Integer variable");
			ap.multiply(Integer.MAX_VALUE,2);	
		}
}

