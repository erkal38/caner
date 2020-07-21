package selfStudy;

public class CounterArray {

	public static void main(String[] args) {
        int[]x= {2,2};
        int[]y= {8,9};
        int[]z= {10,15};
        System.out.println(double23(x));
        System.out.println(double23(y));
        System.out.println(double23(z));
	}

	public static boolean double23(int[] arr) {
		for(int value:arr) {
			if(value==2 || value==3) {
				return true;
			}
		}
		return false;
	}

}
