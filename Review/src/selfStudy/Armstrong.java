package selfStudy;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Bir sayi giriniz");
      int number=sc.nextInt();
      System.out.println("Basamak degeri giriniz");
      int digit=sc.nextInt();
      int sum=0;
      int temp=number;
 	 do {
 		 int value=temp%10;
 		 temp/=10;
 		 sum+=Math.pow(value,digit);
 	} while (temp>0);
      if(sum==number) {
   	   System.out.println("This is an Armstrong number");
   		 
      }else {
   	   System.out.println("This is not an Armstrong number");
   }
} 
}