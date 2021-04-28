package math;

/**
* The MyMath provides a simple calculation of the factorial
* to use as practice on Unit Testing.
*
* @author  nikiboura
*/
public class MyMath {
	
	
	/**
	 * Takes an integer as an input
	 * and returns an integer value which is its factorial.
	 * @param n the input integer
	 * @return an integer value
	 * @exception IllegalArgumentException when the given integer is negative
	 * @exception IllegalArgumentException when the given integer is greater than 12
	 */
	 public int factorial(int n) {
		 
		 if (n < 0 || n > 12) 
				throw new IllegalArgumentException("n should be >= 0 and <= 12");
		 
	        int result = 1;

	        for (int factor = 2; factor <= n; factor++) {
	            result *= factor;
	        }

	        return result;
	    }
	}


	