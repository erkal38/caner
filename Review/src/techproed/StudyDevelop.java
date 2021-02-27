package techproed;

import java.util.Scanner;

public class StudyDevelop {

	public static void main(String[] args) {
	 double salary=0; 
	 Scanner scan=new Scanner(System.in);
	 while(salary<=60000) {
	 System.out.println("Enter any offer");
     salary=scan.nextDouble();
     if(salary>=80000) {
    	 System.out.println("I accept the offer");
     }else if(salary>60000&&salary<80000) {
    	 System.out.println("I negotiate to increase");
     }else {
    	 System.out.println("I do not accept the offer");
     }
     
	}
	}
}
