package practiceClass2062021;

import java.util.Scanner;

public class DivisibleFiveNumber {

	public static void main(String[] args) {
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 or divisible by 5
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
			if (num%5!=0) {
			   System.out.println("num is not divisible 5="+num);
			}else {
				System.out.println("num is divisible 5="+num);
			}
	}

}
