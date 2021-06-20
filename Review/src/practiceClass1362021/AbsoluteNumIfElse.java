package practiceClass1362021;

import java.util.Scanner;

public class AbsoluteNumIfElse {

	public static void main(String[] args) {
      /* 
       * Type java code by using if-else statement,
       * Write a program to print absolute value of a number entered by user.
       */
	 
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Please enter any number");
	  int num=scan.nextInt();
	  if(num>=0) {
		  System.out.println(num+" is absolute");
	  }else
		  System.out.println(-1*num+" is absolute");
	   
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter number ");	
//		int num=scan.nextInt();
//		
//	     int result=Math.abs(num);
//		
//		if (num>=0) {
//			System.out.println(" the absolute number is:  " + num);
//		}else {
//			System.out.println(" the absolute number is : "+ result);
//		}
	}

}
