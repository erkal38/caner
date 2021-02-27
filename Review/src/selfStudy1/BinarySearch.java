package selfStudy1;

import java.util.Arrays;

public class BinarySearch {
   public static void main(String[] args) {
	   int[]binary= {2,4,5,10,9,8};
	   Arrays.parallelSort(binary);
       System.out.println(Arrays.toString(binary));
       System.out.println(Arrays.binarySearch(binary, 7));
   
   }
}
