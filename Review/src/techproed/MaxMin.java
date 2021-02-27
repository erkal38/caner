package techproed;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
      Scanner num=new Scanner(System.in);
      System.out.println("Enter 2 numbers");
      int numMaxMin1=num.nextInt();
      int numMaxMin2=num.nextInt();
	  System.out.println("Maksimum="+max(numMaxMin1,numMaxMin2));
	  System.out.println("Minimum="+min(numMaxMin1,numMaxMin2));
	}

	public static int max(int a, int b) {
		if(a>b) {
		  return a;
		  }
		return b;
	}
	public static int min(int a, int b) {
		if(a<b) {
		  return a;
		  }
		return b;
	}
}
