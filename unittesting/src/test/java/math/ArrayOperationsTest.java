package math;

import io.FileIO;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Assert;
import org.junit.Test;

/**
* This class provides test cases for the 
* ArrayOperations class, for demonstrating Unit Testing.
* @author  nikiboura
*/

public class ArrayOperationsTest {

	public static String resourcesPath = "src/test/resources/";
	
	/* 
	 * A reference to the ArrayOperations class
	 * whose methods we are testing in this class.
	 */
	ArrayOperations ao = new ArrayOperations();
	
	/*
	 * A test case for the findPrimesInFile method
	 * with normal inputs
	 * by mocking the MyMath and FileIO dependencies
	 */ 
	@Test
	public void test_FindPrimesInFile_Mocking() {

		String filepath = resourcesPath.concat("numbers_prime.txt");
		
		//Mock the MyMath and FileIO classes
		MyMath mm = mock(MyMath.class);
		FileIO fi = mock(FileIO.class);
		
		//Desired return values for the isPrime method in MyMath class	
		when(mm.isPrime(3)).thenReturn(true);
		when(mm.isPrime(4)).thenReturn(false);
		when(mm.isPrime(5)).thenReturn(true);
		
		int[] array = {3,4,5};
		//Desired return values for the readFile method in FileIO class
		when(fi.readFile(filepath)).thenReturn(array);
		
		int[] expectedNumbers = new int[] {3,5};
		Assert.assertArrayEquals(expectedNumbers, ao.findPrimesInFile(fi,filepath,mm));
		
	}

}
