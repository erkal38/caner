package demos;

public class SwapNumber {

	public static void main(String[] args) {
      swap(10,20);
		
	}

	public static void swap(int i, int j) {
		
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("i"+" : "+i+" & j "+": "+j);
		
	}

}
