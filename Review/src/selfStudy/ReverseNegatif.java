package selfStudy;

public class ReverseNegatif {

	public static void main(String[] args) {
       System.out.println(reverse(-253));
	}

	public static int reverse(int num) {
		String str = new StringBuilder(""+num).reverse().toString();

		if(num < 0) {

		str = "-"+str.substring(0, str.length()-1);

		}

		return Integer.valueOf(str);

		}
}