package selfStudy1;

public class Reverse {

	public static void main(String[] args) {
      System.out.println(reverse("nalan"));
	}

	public static boolean reverse(String string) {
//       StringBuffer str=new StringBuffer(string);
//       
//		return str.reverse().toString().equals("nalan");
		
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse+=string.charAt(i);
		}
		System.out.println(reverse);
	   return reverse.equals(string);
	}

}
