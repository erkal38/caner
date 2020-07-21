package selfStudy;

public class WrappPrimit {

	public static void main(String[] args) {
        String str1="&#^^182O3^..ne. 52||{{T.*@wo#<< f'!i..@^#!ve";
        System.out.println(decodeTheCode(str1));
        String str2="N0000i!!+###ne***.T((}h#'r%%%<<e>>|<e|f!!o^^##u''r";
        System.out.println(decodeTheCode(str2));
	}

	public static String decodeTheCode(String s) {
		String str="";
		for(int i=0;i<s.length();i++) {
			if(Character.isAlphabetic(s.charAt(i))||s.charAt(i)==' ') {
				str=str+s.charAt(i);
			}
		}
		String[]arr=str.split(" ");
		String str2="";
		for (String value : arr) {
			str2=str2+getDigit(value)+" ";
			
		}
	 return str2;
	}

	public static String getDigit(String st) {
		switch (st.toUpperCase()) {
		case "ZERO":
			return "1";
		case "ONE":
			return "1";
		case "TWO":
			return "2";
		case "THREE":
			return "3";
		case "FOUR":
			return "4";
		case "FIVE":
			return "5";
		case "SIX":
			return "6";
		case "SEVEN":
			return "7";
		case "EIGHT":
			return "8";
		case "NINE":
			return "9";
		case "TEN":
			return "10";

		default:
			break;
		}
	 return st;
	}

}
