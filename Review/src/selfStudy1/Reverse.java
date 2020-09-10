package selfStudy1;

public class Reverse {

	public static void main(String[] args) {
      System.out.println(reverse("nalan"));
	}

	public static boolean reverse(String string) {
       StringBuffer str=new StringBuffer(string);
       
		return str.reverse().toString().equals("nalan");
	}

}
