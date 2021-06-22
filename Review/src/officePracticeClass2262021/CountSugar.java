package officePracticeClass2262021;

import java.util.Scanner;

public class CountSugar {

	public static void main(String[] args) {
		/*Ask the user how many tea they drink and how many sugars they use a day. 
		 * Calculate how many kg of sugar is used in a year and print it.
		1 sugar = 1.7 gr
		Sample= Input:     
		        Tea : 10
		        Sugar :2
		     
		        Output : 12.41 kg/year
		*/
        Scanner scan=new Scanner(System.in);
        System.out.println("how many tea do you drink");
        double tea=scan.nextInt();
        System.out.println("how many sugars do you use in cup of tea in a day");
        double sugars=scan.nextInt();
        System.out.println((tea*sugars*365*1.7)/1000);
        
        
	}

}
