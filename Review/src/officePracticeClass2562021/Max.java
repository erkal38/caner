package officePracticeClass2562021;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
        /*
         * ask a user to get 2 numbers and write a program max number.
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(((a<b )? b+" is the larger number" : a+" is the larger number"));
	}

}
