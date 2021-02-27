package selfStudy;

import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
       int[]arr1= {1,4,5,6};
       int[]arr2= {7,8,9,3};
       
       System.out.println(Arrays.toString(concatArr(arr1,arr2)));
	}

	public static int[] concatArr(int[] arr1,int[]arr2) {
        int[]result=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		int a=0;
        	for(int j=arr1.length;j<result.length;j++) {
        		result[j]=arr2[a];
        		a++;
        }
		return result;
	}

}
