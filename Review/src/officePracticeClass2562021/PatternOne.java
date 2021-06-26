package officePracticeClass2562021;

public class PatternOne {

	public static void main(String[] args) {
/*
11111111
1111111
111111
11111
1111
111
11
1
Write a java program for this pattern 
*/
	for(int i=9;i>0;i--) {
		for(int j=1;j<i;j++) {
			System.out.print("1");
		}
		System.out.println();
	}	
}
}