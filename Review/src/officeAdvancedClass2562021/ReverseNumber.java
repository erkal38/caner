package officeAdvancedClass2562021;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
        /*Write a program to get a number from console and reverse of this number.
         * 
         */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		/*456
		 * 654
		 */
        System.out.println("reverse number =");
        while(number>0) {
        	System.out.print(number%10);
        	number/=10;
        	
        }
	}


}

