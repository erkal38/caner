package practiceClass1362021;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two numbers Show them e menu of operation signs and ask
		 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
		 * Division : 4 Print the result on the console
		 * 
		 * EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		System.out.println();
		System.out.println("Which operator do your prefer?\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
		int operation=scan.nextInt();
        switch (operation) {
		case 1:
			System.out.println("The result of Addition Operation is"+" "+(num1+num2));
			break;
		case 2:
			System.out.println("The result of Addition Operation is"+" "+(num1-num2));
			break;
		case 3:
			System.out.println("The result of Addition Operation is"+" "+(num1*num2));
			break;
		case 4:
			System.out.println("The result of Addition Operation is"+" "+(num1/num2));
			break;

		default:
			break;
		}
	}

}
