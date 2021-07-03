package officePracticeClass2962021;

import java.util.Scanner;

public class NextNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		double num =scan.nextDouble();
		cons(num);
		
	
		
		}
		public static void cons(double num) {
		  for(double i=0; i<3;i++) {
	             System.out.println(++num);
		}
		
		
	}

}
