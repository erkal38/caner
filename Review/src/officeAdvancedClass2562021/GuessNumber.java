package officeAdvancedClass2562021;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		/*
		 * Generate a Random integer between 0-100. ask user to find integer. For every
		 * guess print to console “My number is smaller than your number ”(or greater )
		 * and finally if user find the number print how many guess did user enter.
		 */

		Random rnd = new Random();
		int number = rnd.nextInt(100);
		int count = 1;
		int guess = 0;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an integer less than 100");
			guess = scan.nextInt();
			if (guess == number) {
				System.out.println("You found My number at " + count + " guess");

			} else {

				if (guess < number) {
					System.out.println("My number is greater than yours");
				} else
					System.out.println("My number is smaller than yours");
				count++;
			}
		
		} while (guess != number);

	}

}
