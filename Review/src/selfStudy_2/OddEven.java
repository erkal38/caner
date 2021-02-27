package selfStudy_2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one number");
		int num = sc.nextInt();
		System.out.print(oddEven(num));
		System.out.println(" number is classified");

	}

	public static int oddEven(int num) {
		if (num % 2 == 0) {
			System.out.println("num is Even");
			return num;
		} else {
			System.out.println("num is Odd");
			return num;
		}
	}
}
