package selfStudy1;

import java.util.Scanner;


public class ReverseNegatif {

	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
		System.out.println("negatif sayi giriniz");
		int src1=src.nextInt();
		while(src1>0) {
	    System.out.println("Try again");
	    src1=src.nextInt();
	    if(src1<0) {
	    	reverseNegatif(src1);
	    }
		}
	}
		
	public static void reverseNegatif(int num) {

	    String str=Integer.toString(num);
		StringBuilder str1=new StringBuilder(str);
		String str2=str1.reverse().toString();
//		System.out.println(str1.reverse().toString());
		str2=str2.replace("-","");
		int num2=Integer.parseInt(str2);
	
      System.out.println("-"+num2);
       		
	}
	

}
