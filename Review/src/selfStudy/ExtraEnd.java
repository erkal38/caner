package selfStudy;

public class ExtraEnd {

	public static void main(String[] args) {
         System.out.println(extraEnd("Hello"));
         System.out.println(extraEnd("java"));
         System.out.println(extraEnd("coding"));
	}

	public static String extraEnd(String string) {
	  return string.substring(1,string.length()-1);
	
	}
    
}
