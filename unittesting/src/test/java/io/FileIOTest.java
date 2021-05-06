package io;
import io.FileIO;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


/**
* This class provides test cases for the 
* FileIO class, for demonstrating Unit Testing.
* @author  nikiboura
*/

import org.junit.Test;

public class FileIOTest {

	public static String resourcesPath = "src/test/resources/";
	
	/* 
	 * A reference to the FileIO class
	 * whose methods we are testing in this class.
	 */
	FileIO fileio = new FileIO();

	/*
	 * A test case for the readFile method
	 * with normal inputs 
	 * using the numbers_normal.txt file as a resource
	 */ 
	@Test
	public void test_ReadFile_Valid_Input() {
		int[] expectedNumbers = new int[] {1,2,3,4,5,6};
		String validInputFilepath = resourcesPath.concat("numbers_normal.txt");
		
		Assert.assertArrayEquals(expectedNumbers, fileio.readFile(validInputFilepath));
	}
	
	/*
	 * A test case for the readFile method
	 * with invalid entries
	 * to ensure that the method ignores them
	 */ 
	@Test
	public void test_ReadFile_Contains_Invalid_Entries() {
		int[] expectedNumbers = new int[] {1,2,4,5,6};
		String validInputFilepath = resourcesPath.concat("invalid_entries.txt");
		
		Assert.assertArrayEquals(expectedNumbers, fileio.readFile(validInputFilepath));
	}
	
	/*
	 * A test case for the readFile method
	 * for the exception caused if the file is empty and 
	 * if the file does not exist
	 * the exception is performed with a @Rule
	 */ 
	 @Rule 
	 	//initialize it to .none()
		public ExpectedException thrown = ExpectedException.none(); 
	 
		@Test 
		public void test_Read_File_Empty_File_Exception() {
		
			String validInputFilepath = resourcesPath.concat("numbers_empty.txt");
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("Given file is empty");
			fileio.readFile(validInputFilepath);

		}
		
		@Test 
		public void test_Read_File_No_File_Exception() {
		
			String validInputFilepath = resourcesPath.concat("numbers_none.txt");
			thrown.expect(IllegalArgumentException.class);
			thrown.expectMessage("Input file does not exist");
			fileio.readFile(validInputFilepath);

		}

}


