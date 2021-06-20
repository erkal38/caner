package practiceClass2062021;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        /*Explanation about primeNumber,Prime numbers are numbers that have only 2 factors: 
         * 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11. By contrast, numbers with more than 2 factors are call composite number.
		 */
		Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int container = 0;
        if(num<=1) {
        	System.out.println("Greater than 1,must be prime number");
        }else {
          for(int i=2;i<num;i++) {
        	  if(num%i==0) {
        		container++;  
        	  }
          }
          if(container==0) {
        	  System.out.println("is prime number");
          }else {
        	  System.out.println("is not prime number");
          }
        }
}
}