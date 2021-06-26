package officePracticeClass2562021;

public class NaturalNumbers {

	public static void main(String[] args) {
		/*
		 * WhileLoop, write a Program to find the sum of natural numbers from 1 to 100.
		 * Example; 
		 * OUTPUT : Sum of Natural Numbers =
		 */

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum =sum+i;
			i++;
		}

		System.out.println("Sum of Natural Numbers " + sum);

	}

}
