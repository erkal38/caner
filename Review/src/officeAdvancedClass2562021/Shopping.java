package officeAdvancedClass2562021;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		/*QUESTION
         * Get the number and list price of the product purchased from the user,
         * ask the user if they have a customer card
         *
         * If you have a customer card,20% off if you buy more than 10 products,15% off if you don't.
         * If the customer does not have a card,15% off if he buys more than 10 products,10% off if he does not
         *
         */
      Scanner scan=new Scanner(System.in);
      System.out.println("enter product number");
      int number=scan.nextInt();
      System.out.println("Enter list price of product");
      double price=scan.nextDouble();
      System.out.println("Do you have a customerCard= 1:YES 2:NO");
      int card=scan.nextInt();
      
      if(card==1 && number>10) {
    	  System.out.println("%20 discount got it = "+number*price*0.80);
      }else if(card==1 && number<10) {
    	  System.out.println("%15 discount got it = "+number*price*0.85);
      }else if(card==0 && number>10) {
    	  System.out.println("%15 discount got it = "+number*price*0.85);
      }else if(card==0 && number<10) {
    	  System.out.println("%10 discount got it = "+number*price*0.90);
      }else {
    	  System.out.println("Please enter correct option");
      }
      
	}

}
