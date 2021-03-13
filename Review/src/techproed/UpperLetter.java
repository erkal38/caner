package techproed;

import java.util.Scanner;

public class UpperLetter {

	public static void main(String[] args) {
      Scanner name=new Scanner(System.in);
      System.out.println("Enter firstname and lastname");
      String firstName=name.nextLine();
      String lastName=name.nextLine();
      System.out.println("FirstName = "+firstName.toUpperCase().charAt(0)+firstName.substring(1));
      System.out.println("LastName  = "+lastName.toUpperCase().charAt(0)+lastName.substring(1));
      
	}

}
