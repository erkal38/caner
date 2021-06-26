package officePracticeClass2562021;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
     /*Write a java program to get 5 numbers from keyboard and find their sum and average.
      * Example:Input 5 numbers:
      * 1
      * 2
      * 3
      * 4
      * 5
      * Output :
      * The Sum of 5 number is: 15
      * The Average is :3
      * 
      */
	 	Scanner scan=new Scanner(System.in);
	 	System.out.println("Please enter 5 numbers");
	 	int num1=scan.nextInt();
	 	int num2=scan.nextInt();
	 	int num3=scan.nextInt();
	 	int num4=scan.nextInt();
	 	int num5=scan.nextInt();
	 	
	 	int sum=num1+num2+num3+num4+num5;
	 	int average= sum/5;
	 	System.out.println("The Sum of 5 number is: "+sum);
	 	System.out.println("The Average is : "+average);
	}

}
