package techproed;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			
		System.out.println("Enter a year...");
		int year = scan.nextInt();
		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println("LeapYear");
		} else if (!(year % 100 == 0) && (year % 4 == 0)) {
			System.out.println("LeapYear");
		} else {
			System.out.println("is not leap year...");
		} 
		}
		while (true);
		
		}
	}
	


