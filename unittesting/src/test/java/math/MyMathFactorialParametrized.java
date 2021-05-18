package math;

import math.MyMath;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;


/**
 * This class provides Parameterized test
 * for the MyMath factorial method, 
 * for demonstrating Unit Testing.
 * @author nikiboura
 */
@RunWith(Parameterized.class)
public class MyMathFactorialParametrized {
	
			//id of each parameter
			@Parameter (value = 0) 
			public int fact;
			@Parameter (value = 1) 
			public int result;
			
			/* 
			 * A reference to the MyMath class
			 * whose methods we are testing in this class.
			 */
			 MyMath mm = new MyMath();
			
			/*
			 * Generates the input values 
			 * for the tests. 
			 */
			@Parameters
			public static Collection<Object[]> data() {
				Object[][] data = new Object[][]{{0,1},{1,1},{2,2},{12,479001600}};
				
				return Arrays.asList(data);
			}
			
			/*
			 * Unit test that is executed for each pair of 
			 * parameters. 
			 */
			@Test
			public void test_Factorial_With_Normal_Cases() {
				Assert.assertEquals(result, mm.factorial(fact));
			}
			
}
