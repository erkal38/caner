package demos;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
     int num=19;
     if(primeNumber(num)) {
    	 System.out.println(num+" is a prime number");
     }else {
    	 System.out.println(num+" is not a prime number");
     }
	}

	public static boolean primeNumber(int num) {
      boolean flag=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		
		
		return flag;
	}

	

}
