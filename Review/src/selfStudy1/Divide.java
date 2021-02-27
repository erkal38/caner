
package selfStudy1;

public class Divide {

	public static void main(String[] args) {
          devides(6,3);
	}
	public static void devides(int num1, int num2) {

		if(num2==0) {

		System.out.println("Invalid Number");

		return;

		}

		System.out.print(num1 +" devid by "+num2 +" is: ");

		int count =0;

		while(num1 >= num2) {

		num1 -= num2;

		count++;

		}

		System.out.println(count+" and remainder is "+num1);

		}
}
