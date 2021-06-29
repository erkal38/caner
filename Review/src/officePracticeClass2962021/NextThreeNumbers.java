package officePracticeClass2962021;

import java.util.Scanner;

public class NextThreeNumbers {

	public static void main(String[] args) {
		/*Write a metod, getting a number from user than get next 3 numbers.
		 * Example=> input number =15
		 *           output       =16,17,18
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		next3(scan.nextInt());
	}

	public static void next3(int num) {
		for(int i=1;i<=3;i++) {
			System.out.println(++num);
		}
		
	}

}
