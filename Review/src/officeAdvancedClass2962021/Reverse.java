package officeAdvancedClass2962021;


public class Reverse {

	public static void main(String[] args) {
       /*write a method using StringBuffer class reverse method  and to get reverse any string.
        * 
        */
		
		name("nugre");
	}

	public static void name(String string) {
       StringBuffer str=new StringBuffer(string);
       String reverseString=str.reverse().toString();
       System.out.println(reverseString);
		
		
		
//		String reverse="";
//		for(int i=string.length()-1;i>=0;i--) {
//			reverse+=string.charAt(i);
//		}
//		System.out.println(reverse);
//	   return reverse.equals(string);
	}

}
