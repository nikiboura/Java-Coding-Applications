package math;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

import io.FileIO;

/**
* The ArrayOperations provides simple operations
* using the MyMath and FileIO classes
* that serve as hands-on practice on Unit Testing.
*
* @author  nikiboura
*/

public class ArrayOperations {
	
	public static String resourcesPath = "src/test/resources/";
	
		/**
		 * Iterates an array of numbers and returns a new array
		 * that contains only its prime numbers 
		 * using the isPrime method of the MyMath class 
		 * and the readFile method of the FileIO class
		 * @param fileio to read a file with numbers
		 * @param filepath the file's location
		 * @param mymath to determine if a number is prime or not
		 * @return an array of prime numbers
		 */
		public static int[] findPrimesInFile(FileIO fileIo,String filepath, MyMath myMath) {
			
			//	Returns an array with numbers		
			int[] array = fileIo.readFile(filepath);
			
			//	Initialize the List that will store only the prime numbers	
			List<Integer> primeList = new ArrayList<>();
		
			for(int i=0;i<array.length;i++){
				
				if (myMath.isPrime(array[i])== true){
					primeList.add(array[i]);	
				}
			}
			
			//	Convert the List to array
			return primeList.stream().mapToInt(i -> i).toArray();
			
		}
	
	}
	
