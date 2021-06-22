package officeAdvancedClass2262021;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		     /*Write a program ,a given number is it equal or not with random number 
		      * 
		      */
		      int i=50;
		      System.out.println(i);
	          Random rn=new Random();
	          int random=rn.nextInt(60)+1;
	          if(random==i) {
	          	System.out.println("random=number");
	          }
	          System.out.println(random);  	
	}
	  }
