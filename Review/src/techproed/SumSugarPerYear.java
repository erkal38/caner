package techproed;

import java.util.Scanner;

public class SumSugarPerYear {
    
	public static void main(String[] args) {
	   Scanner tea=new Scanner(System.in);
	   Scanner sugars=new Scanner(System.in);
	   System.out.println("Enter how many tea you drink a day");
	   double numTea=tea.nextInt();
	   System.out.println("Enter how many sugars you use a day in one cup of tea");
	   double numSugars=sugars.nextInt();
//	   1 sugar= 1.7 gr
	   double  sugarPerYear=((numTea*numSugars*365*1.7)/1000);
	   System.out.println(sugarPerYear+" "+"kg/year");
	   
}
}
