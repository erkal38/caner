package techproed;

import java.util.Scanner;

public class AgeFinding {

	public static void main(String[] args) {
       Scanner age=new Scanner(System.in);
       System.out.println("Enter the birthday of Yusuf");
       int yearOfYusuf=age.nextInt();
       int monthOfYusuf=age.nextInt();
       int dayOfYusuf=age.nextInt();
       System.out.println("The birthday of Yusuf= "+yearOfYusuf+"/"+monthOfYusuf+"/"+dayOfYusuf);
       System.out.println("Enter the birthday of Mehmet");
       int yearOfMehmet=age.nextInt();
       int monthOfMehmet=age.nextInt();
       int dayOfMehmet=age.nextInt();
       System.out.println("The birthday of Mehmet= "+yearOfMehmet+"/"+monthOfMehmet+"/"+dayOfMehmet);
	   if(yearOfYusuf>yearOfMehmet) {
		   System.out.println("Yusuf is older");
	   }else if(yearOfMehmet>yearOfYusuf) {
		   System.out.println("Mehmet is older");
	   }else if(yearOfMehmet==yearOfYusuf) {
		      if(monthOfMehmet>monthOfYusuf) {
		    	  System.out.println("Mehmet is older");
		      }else if(monthOfYusuf>monthOfMehmet) {
		    	  System.out.println("Yusuf is older");
		      }else if((yearOfMehmet==yearOfMehmet)&&(monthOfMehmet==monthOfYusuf)) {
	                 if(dayOfMehmet>dayOfYusuf) {
	                	 System.out.println("Mehmet is older");
	                 }else if(dayOfYusuf>dayOfMehmet) {
	                	 System.out.println("Yusuf is older");
	                 }
		      }
	}
	}
}
