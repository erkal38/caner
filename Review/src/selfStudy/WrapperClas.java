package selfStudy;

public class WrapperClas {

	public static void main(String[] args) {
        String str="(((W&e**_lco74me %t%o co!@!$,,<r>e <J>>>>+av'''a8888.||}]";
        System.out.println(filter(str));
	}

	public static String filter(String str) {
		String sum="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				sum+=str.charAt(i);
			}
		}
		return sum;
		
	}

}
