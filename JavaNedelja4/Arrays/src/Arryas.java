import java.util.Arrays;
import java.util.ArrayList;

public class Arryas {

	public static void main(String[] args) {
		int[] arr = { -5, 1, 3, 7, 12, 16, 18 };

		// Print the original array
		System.out.println("Original array: " + Arrays.toString(arr));

		// Sort the array
		Arrays.sort(arr);
		System.out.println("Sorted array: " + Arrays.toString(arr));

		// Search for an element in the array
		int index = Arrays.binarySearch(arr, -5);
		System.out.println("Index of element '-5': " + index);

		// Fill an array with a specific value
		int[] filledArray = new int[5];
		Arrays.fill(filledArray, 7);
		System.out.println("Filled array: " + Arrays.toString(filledArray));

		// Compare two arrays
		int[] arr2 = { 5, 2, 8, 1, 3 };
		boolean areEqual = Arrays.equals(arr, arr2);
		System.out.println("Are arr and arr2 equal? " + areEqual);

		// Copy an array
		int[] copiedArray = Arrays.copyOf(arr, arr.length);
		System.out.println("Copied array: " + Arrays.toString(copiedArray));
		
		ArrayList< String > kolString = new ArrayList< String >();
		System.out.printf("Početna veličina: %d\n", kolString.size());
		kolString.add("Prvi");
		kolString.add("Drugi");
	}

}




