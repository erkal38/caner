package officeAdvanceClass03072021;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		     /*Write a program ,a given number is it equal or not with random number 
		      * i=50; range of random (1-60)
		      */
	      int i=50;
	      System.out.println("given number is= "+i);
	      Random rn=new Random();
	      int num=rn.nextInt(60)+1;
	      System.out.println("random number is= "+num);
	      if(num==i) {
	    	  System.out.println("random number is equal to given number");
	      }
	      System.out.println(num);
	      
	}
	  }
