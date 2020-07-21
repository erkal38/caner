package selfStudy;

import java.util.Arrays;


public class AddArrayItem {

	public static void main(String[] args) {
       int[]array= {12,5,7,13};
       System.out.println(Arrays.toString(AddArrayItem(array,9,3)));
       
	}

	public  static int[] AddArrayItem(int[] arr, int num, int position) {
         int[] newArr=new int[arr.length+1];
         for(int i=0,j=0;i<newArr.length;i++) {
        	 if(i==position) {
        		 newArr[i]=num;
        	 }else {
        		 newArr[i]=arr[j];
        		 j++;
        	 }
         }
		return newArr;
	}

}
