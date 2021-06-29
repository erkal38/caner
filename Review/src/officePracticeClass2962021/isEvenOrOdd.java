package officePracticeClass2962021;

import java.util.Scanner;

public class isEvenOrOdd {

	public static void main(String[] args) {
		/*Write a method and get a number from user then calculate number is even or odd
		 * 
		 */
      isEvenOrOdd();
    
	}

	public static void isEvenOrOdd() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
//		if(num%2==0) {
//			System.out.println("Number is even");
//		}else {
//			System.out.println("Number is odd");
//		}
		System.out.println(num%2==0?"Number is even":"Number is odd");
	}
}