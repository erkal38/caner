package selfStudy1;

public class PrimeNumber {
	public static void main(String[] args) {
		int number=11;
       System.out.print(primeNumber(number));
       
	}

	public static boolean primeNumber(int num) {
		boolean result=true;
		if(num<=1) {
			return result;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("asal sayi degil");
				return false;
		}
	        
		}
		return result;

	}
}