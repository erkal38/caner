package selfStudy1;

public class Reverse {

	public static void main(String[] args) {
      System.out.println(reverse("ergun"));
	}

	public static String reverse(String string) {
       StringBuilder str=new StringBuilder(string);
       
		return str.reverse().toString();
	}

}
