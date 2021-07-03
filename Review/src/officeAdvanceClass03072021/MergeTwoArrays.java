package officeAdvanceClass03072021;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		/*write a method and merge given two arrays
		 * arr[] = { 8, 2, 3 }
		 * arr2[] = { 4, 5, 6 }
		 * output=[8, 2, 3, 4, 5, 6]
		 */
	     int[]arr= { 8, 2, 3 };
	     int[]arr2={ 4, 5, 6 };
	     merge(arr,arr2);
  
	}
   
	public static void merge(int[] arr, int[] arr2) {
      		int arr3[]=new int[arr.length+arr2.length];
      		for (int i = 0; i < arr.length; i++) {
             arr3[i]=arr[i];//8,2,3
			}
	         for (int i = 0; i < arr2.length; i++) {
				arr3[arr.length+i]=arr2[i];
			}
	System.out.println(Arrays.toString(arr3));
	}
}
