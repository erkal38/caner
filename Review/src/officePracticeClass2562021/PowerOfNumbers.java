package officePracticeClass2562021;

import java.util.Scanner;

public class PowerOfNumbers {

	public static void main(String[] args) {
		// Let's get 2 numbers from the user.
		// 1. number base
		// 2. number power
		// Let's calculate the power of the number.
		// 3, 3 results = 27
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int numBase=scan.nextInt();
		int numPower=scan.nextInt();
		int result=1;
		
		for(int i=1;i<=numPower;i++) {
			result=result*numBase;
		}
		
		System.out.println(result);
	}

}
