package practiceClass2062021;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
        //1.Ask user to enter a word. If the word has odd number of characters 
		//length() of characters
        //and has 3 or more characters, print the character in the middle of the word.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();


        if(word.length()%2==1 && word.length()>=3) {
            System.out.println("The word has odd number");

            System.out.println("middleChar is = "+word.substring(word.length()/2, word.length()/2+1));


        }else {
            System.out.println("It has not odd number of characters");
        }
	}

}
