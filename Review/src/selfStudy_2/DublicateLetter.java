package selfStudy_2;

import java.util.Arrays;
import java.util.TreeSet;

public class DublicateLetter {

	public static void main(String[] args) {
      System.out.println(str("AAABBBCCCDDD"));
		
	}

	public static String str(String string) {
       string=new TreeSet<String>(Arrays.asList(string.split(""))).toString();
		return string;
	}

}
