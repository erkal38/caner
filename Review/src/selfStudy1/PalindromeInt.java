package selfStudy1;

public class PalindromeInt {

	public static void main(String[] args) {
        isPalindromeInt(626);
	}
	public static void isPalindromeInt(int i) {
         String str=Integer.toString(i);
         StringBuilder str2=new StringBuilder(str);
         int num=Integer.parseInt(str2.reverse().toString());
         System.out.println(num);
         if(num==i) {
        	 System.out.println("is palindrome");
         }else {
        	 System.out.println("is not palindrome");
         }
	}
}
