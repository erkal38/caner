package selfStudy1;

import java.util.Arrays;
import java.util.Collections;

public class TwoArray {

	public static void main(String[] args) {
      int[]num= {1,2,4};
      int[]num1= {5,6,7};
      System.out.println(Arrays.toString(concatTwoArray(num,num1)));
	}

	public static int[] concatTwoArray(int[] num, int[] num1) {
		int[]result=new int[num.length+num1.length];
		int i=0;
		for (int each : num) {
			result[i]=each;
			i++;
			
		}
		for (int each2 : num1) {
			result[i]=each2;
			i++;
			
		}
		
		return result;
		
	}
 
}
