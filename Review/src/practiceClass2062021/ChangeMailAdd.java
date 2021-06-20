package practiceClass2062021;

import java.util.Scanner;

public class ChangeMailAdd {

	public static void main(String[] args) {
        // ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hotmail address");
        String hotmail = scan.nextLine();
        if (hotmail.contains("@hotmail")) {
            String gmail = hotmail.replace("@hotmail.com", "@gmail.com");// order is important
            System.out.println(gmail);
        } else {
            System.out.println("You didn't enter a hotmail");
        }
        scan.close();
	}

}
