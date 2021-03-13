package techproed;

import java.util.Scanner;

public class WordOdd {

	public static void main(String[] args) {
       Scanner odd=new Scanner(System.in);
       System.out.println("Enter a word");
       String oddWord=odd.nextLine();
       if(oddWord.length()%2!=0) {
    	   System.out.println(oddWord.charAt(oddWord.length()/2));
       }else {
    	   System.out.println("The word has even number");
       }
    	   
	}

}
