package officePracticeClass2962021;

import java.util.Scanner;

public class CubeWithMethod {

	public static void main(String[] args) {
		/*Write a method and get a number from user then calculate cube of this number
         */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		double num =scan.nextInt();
		System.out.println(calc(num));
		
		scan.close();
		
		
	}
	
	public static double calc(double num) {
//		return num*num*num;
		
		return Math.pow(num, 3); // --> change return type to double
	}
	
}

