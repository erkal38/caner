package officeAdvancedClass2562021;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		     /*Write a program ,a given number is it equal or not with random number 
		      * 
		      */
		      int i=50;
		      System.out.println("input number= "+i);
	          Random rn=new Random();
	          int random=rn.nextInt(60)+1;
	          System.out.println("random number= "+random);
	          if(random==i) {
	          	System.out.println("random number is equal input number");
	          }
	          System.out.println(random);  	
	}
	  }
