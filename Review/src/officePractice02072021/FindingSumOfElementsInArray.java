package officePractice02072021;

public class FindingSumOfElementsInArray {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array
		 *
		 * Then print the result, in the main method
		 *
		 * Eg : input : {4,6,8,10}; output: 28
		 *
		 */
//NOTE with return type put sum line 19 
		int input[] = { 4,6,8,10 };
		sumOfElements(input);
		//System.out.println("Sum of all element : ");

	}

	public static void sumOfElements(int input[]) {
        int sum=0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		 System.out.println(sum);
	}
}
