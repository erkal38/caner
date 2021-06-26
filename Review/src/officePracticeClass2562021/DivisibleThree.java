package officePracticeClass2562021;

public class DivisibleThree {

	public static void main(String[] args) {
		// Let's print the numbers from 0 to 100 to 3 and the numbers to be divided.
        // Numbers dividing by 3:0 3 6 9 12 ----
         
		for(int i=0;i<100;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
	}

}
