package practiceClass2062021;

import java.util.Scanner;

public class RepeatedLetters {

	public static void main(String[] args) {
		/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
ORNEK:
    INPUT      : Mustafa
    OUTPUT     : fafafa
		 */
       Scanner scan=new Scanner(System.in);
       System.out.println("Please enter a string");
       String name=scan.next();
       String str=name.substring(name.length()-2);
       for (int i = 1; i <4; i++) {
    	   System.out.print(str);
		
	}
	}

}
