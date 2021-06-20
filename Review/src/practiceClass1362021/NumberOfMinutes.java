package practiceClass1362021;

import java.util.Scanner;

public class NumberOfMinutes {

	public static void main(String[] args) {
      /* Ask user to enter minutes,
       * Write a Java program to convert minutes into a number of years and days.
       * Input: number of minutes 3456789
       * Output: 3456789 minutes is approximately 6 years and 210 days
       */
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Please enter number of minutes");
	   long minutes=sc.nextLong();
	   long years=minutes/(60*24*365);
	   long days=(minutes/60/24)%365;
//	   System.out.println(days);
	   System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
	}

}
