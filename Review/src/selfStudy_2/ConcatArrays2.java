package selfStudy_2;

import java.util.Arrays;

public class ConcatArrays2 {

	public static void main(String[] args) {
		int[] arr1 = { 4, 5, 6, 7, 8 };
		int[] arr2 = { 9, 10, 11, 12 };
		System.out.println(Arrays.toString(result(arr1, arr2)));
	}

	public static int[] result(int[] arr1, int[] arr2) {
		
		  int[] result = new int[arr1.length + arr2.length];

		    int i = 0;

		    for(int each: arr1) {

		    result[i] = each;

		    i++;

		    }  

		    for(int each: arr2) {

		    result[i] =each;

		    i++;

		    }
          return result;

		    }

	
}


