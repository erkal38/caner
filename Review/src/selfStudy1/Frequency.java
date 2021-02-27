package selfStudy1;

import java.util.Arrays;

public class Frequency {

	public static void main(String[] args) {
     System.out.println(str("AAABBCDD"));
	}

	public static String str(String string) {
		String result="";
		int j=0;
		for(;j<string.length();) {
			int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)==string.charAt(j)) {
				count++;
			}
		}
	   result+=string.charAt(j)+""+count;
	   string=string.replace(""+string.charAt(j),"");
		}
    return result;
	}

}
