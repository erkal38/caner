package demos;

@FunctionalInterface
interface Cab{
	public void bookcab();
}

public class LambdaDemo {

	public static void main(String[] args) {
      Cab cab=()->System.out.println("Ola is booked");
      cab.bookcab();
	}

}
