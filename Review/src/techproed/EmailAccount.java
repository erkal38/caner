package techproed;

import java.sql.Time;
import java.util.Scanner;

public class EmailAccount {

	public static void main(String[] args) throws InterruptedException {
     Scanner mail=new Scanner(System.in);
     do {
     System.out.println("Enter an email");
     String mailAddress=mail.next();
     if (mailAddress.contains("@")&&mailAddress.contains("gmail.com")) {
    	 System.out.println("email approved");
    	 break;
     }else if(!mailAddress.contains("@")) {
    	 System.out.println("enter a valid email");
    	 
    	 Thread.sleep(1000);
     }else if(!mailAddress.contains("gmail.com")) {
    	 System.out.println("Please enter your gmail account");
    	 Thread.sleep(1000);
     }
     }
     while(true);
     
	}

}
