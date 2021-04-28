package math;

import org.junit.runner.JUnitCore;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* A class with the main method for executing the defined 
* classes that include tests and presenting the results 
* @author nikiboura
*/ 
	public class TestRunner {

		public static void main(String[] args) {
			
			
			Result result = JUnitCore.runClasses(
					MyMathTest.class,
					MyMathFactorialParametrized.class );
				
			
			// Printing any failed tests
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.getMessage());
			}
			
			// Printing a success message 
			System.out.println("Tests completed successfully :: " 
			+ result.wasSuccessful());
		}

	}


