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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = scan.next();
		if(word.length()>=2) {
			System.out.println(word.substring(word.length()-2)+word.substring(word.length()-2)+word.substring(word.length()-2));
		}else {
			System.out.println("Length of String should be at least 2");
		}
		scan.close();
	}

}
