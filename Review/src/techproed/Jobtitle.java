package techproed;

import java.util.Scanner;

public class Jobtitle {

	public static void main(String[] args) {
        Scanner jobTitle=new Scanner(System.in);
        System.out.println("Please enter your job title");
        String jobName=jobTitle.next();
        if(jobName.equals("qa")) {
        	System.out.println("Your job title is Quality Analyst");
        }else if(jobName.equals("dev")) {
        	System.out.println("Developer");
        }else if(jobName.equals("ba")) {
        	System.out.println("Business Analyst");
        }else if(jobName.equals("pm")) {
        	System.out.println("Project Manager");
        }
		
	}

}
