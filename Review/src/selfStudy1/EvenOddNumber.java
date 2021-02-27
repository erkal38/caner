package selfStudy1;

public class EvenOddNumber {
	public static void main(String[] args) {
		identify(5);
		identify(6);
		System.out.println(identify(5));
	}

	public static String identify(int num) {
		
        return num%2==0?"Even":"Odd";		
	}

}
