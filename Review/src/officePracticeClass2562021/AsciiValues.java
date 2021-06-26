package officePracticeClass2562021;

public class AsciiValues {

	public static void main(String[] args) {
        /*
         * Write a Java program that prints ascii values of characters 	from ‘a’ to ‘z’
         * Short for American Standard Code for Information Interexchange,(https://www.computerhope.com/jargon/a/ascii.htm)
         * ASCII is a standard that assigns letters, numbers, and other characters in the 256 slots available in the 8-bit code
         */
        for (char i = 'a'; i <= 'z'; i++) {
            int x=i;
            System.out.println( "Ascii value of " + i + " = " +i );
        }
	
	}

}
