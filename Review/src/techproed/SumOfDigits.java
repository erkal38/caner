package techproed;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println(sum());
	}
	public static int sum() {
		Scanner num=new Scanner(System.in);
		int container=0;
		System.out.println("Enter 3 numbers");
		int j=1;
		while(j<4) {
		 int numEnter=num.nextInt();
		 j++;
			container+=numEnter;
		
		}
		return container;
		}
}
