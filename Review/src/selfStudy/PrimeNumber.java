package selfStudy;

public class PrimeNumber {

	public static void main(String[] args) {
        int number = 12;
       if (primeNumber(number)) {
    	   System.out.println(number+" is a prime number ");
       }else {
    	   System.out.println(number+" is not a prime number");
       }
	}
        public static boolean primeNumber(int number) {
        boolean flag=true;
		if(number==0||number==1) {
        	flag=false;
        }else 
        	for(int i=2;i<number;i++) {
        		if(number%i==0) {
        			flag=false;
        			break;
        		}
        	}
		return flag;
	      
	      
	}

}
		

