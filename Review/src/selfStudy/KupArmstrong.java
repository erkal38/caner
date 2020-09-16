package selfStudy;

public class KupArmstrong {

	public static void main(String[] args) {
		System.out.println(armstrongSayi(371));
	}

	public static boolean armstrongSayi(int num) {
		
		int a = 0,    b =0,    c= num;

		while(num>0){

		              a=num%10; 

		              num/=10; 

		              b=b+(a*a*a);

		}

		 

		if(c==b) {

		return true;

		}

		return false;

		}
}