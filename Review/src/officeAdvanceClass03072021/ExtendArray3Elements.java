package officeAdvanceClass03072021;

import java.util.Arrays;

public class ExtendArray3Elements {

	public static void main(String[] args) {
        /*
         * Write a method that accepts an array which has 3 elements
         * and returns a new array with 3 times more the length
         * where its first and last element is the
         * same as the original array, put middle number of original array into the
         * middle of your new array
         * input={1,2,3}
         * output={1,0,0,0,2,0,0,0,3}
         */
		 int[]input= {1,2,3};
		 longArray(input);


    }

	public static void longArray(int[] input) {
       int[] longArray=new int[9];
       System.out.println(Arrays.toString(longArray));
       
       longArray[0]=input[0];
       System.out.println(Arrays.toString(longArray));
       longArray[4]=input[1];
       System.out.println(Arrays.toString(longArray));
       longArray[8]=input[2];
       System.out.println(Arrays.toString(longArray));
       
       
	}
}

