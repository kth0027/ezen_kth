package Day07;

import java.util.Arrays;
import java.util.Collections;

public class array {
	public static void main(String[] args) {

//		int array[] = {1, 5, 19, 29, 25};
//		
//		Arrays.sort(array);
//		
//		for ( int i : array ) {
//			System.out.print(" ["+i+"] ");
//		}
//		
//		Integer array2[] = {4,23,33,15,17,19};
//        Arrays.sort(array2,Collections.reverseOrder());
//        
//        for (int i : array2) {
//        	System.out.println("");
//            System.out.print(" ["+i+"] ");
//        }

		int[] arr = { 1, 26, 17, 25, 99, 44, 303 };

		Arrays.sort(arr);

		System.out.println("Sorted arr[] : " + Arrays.toString(arr));

		Integer[] arr2 = { 1, 26, 17, 25, 99, 44, 303 };

		Arrays.sort(arr2, Collections.reverseOrder());

		System.out.println("Sorted arr[] : " + Arrays.toString(arr2));
	}

}
