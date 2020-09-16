package selfStudy1;

public class ReverseNegatif {

	public static void main(String[] args) {
     System.out.println(reverseNegatif(-122));
	}

	public static int reverseNegatif(int num) {
		String str=new StringBuilder(""+num).reverse().toString();
		str="-"+str.substring(0,str.length()-1);
		int num1=Integer.parseInt(str);
		num1=10+num1;
		
		return num1;
		
       		
	}

}
