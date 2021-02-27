package techproed;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
       Scanner triangle=new Scanner(System.in);
       System.out.println("Enter 3 integers for triangle");
       int  a=triangle.nextInt();
       int  b=triangle.nextInt();
       int  c=triangle.nextInt();
       if((a+b>c)&&(a>b)) {
    	   if(c>a-b) {
    		   System.out.println("only triangle");
    	   }
       }else if((a+c>b)&&(a>c)) {
    	   if(b>a-c) {
    		   System.out.println("only triangle");
    	   }
       }else if ((b+c>a)&&(b>c)) {
    	   if(a>b-c) {
    		   System.out.println("only triangle");
    	   }
       }else if ((a==b)&&(b==c)) {
    	   System.out.println("equilateral triangle");
       }else {
    	   System.out.println("not triangle");
       }
		
	}

}
