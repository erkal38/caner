package techproed;

import java.util.Scanner;

public class NotesWords {

	public static void main(String[] args) {
		Scanner notes = new Scanner(System.in);
		System.out.println("Enter an uppercase letters");
		do {

			String enterNotes = notes.nextLine();
			switch (enterNotes) {
			case "A":
				System.out.println("Excellent");
				break;
			case "B":
				System.out.println("Good");
				break;
			case "C":
				System.out.println("Average");
				break;
			case "D":
				System.out.println("Deficient");
				break;
			case "F":
				System.out.println("Failing");
				break;

			default:
				System.out.println("Invalid input,re-try");
				break;
			}
		} while (true);

	}

}
