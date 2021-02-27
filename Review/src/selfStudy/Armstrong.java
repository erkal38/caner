package selfStudy;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num = 153;
		int a = 0, b = 0, c = num;

		while (num > 0) {

			a = num % 10;

			num /= 10;

			b = b + (a * a * a);

		}

		if (c == b) {

			System.out.println("Armstrong");
		}else {

			System.out.println("Armstrong degil");
	}
}
}