package officePractice02072021;

import java.util.Arrays;

public class NumbersOfEven {

	public static void main(String[] args) {
		/* write a method that accepts an integer array as input and prints
		* how many even numbers are there in this array?
		* arr={1,5,8,4,6}
		* output=3
		*/
		int[]array={1,2,8,4,6};
		
		System.out.println(evenNumbers(array));
	    
	}
		
public static int evenNumbers(int[]array) {
	  int out=0;
	
	   for (int i = 0; i < array.length; i++) {
		   if(array[i]%2==0) {
			   out++;
		   }
		
	}
	return out;
   
   }
}
