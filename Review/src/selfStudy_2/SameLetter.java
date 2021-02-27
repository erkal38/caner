package selfStudy_2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SameLetter {

	public static void main(String[] args) {
       System.out.println(str("ahmet","tehma"));
		
	}

	public static boolean str(String string1, String string2) {
	 string1=new TreeSet<String>(Arrays.asList(string1.split(""))).toString();
	 System.out.println(string1.replace(",",""));
     string2=new TreeSet<String>(Arrays.asList(string2.split(""))).toString();		
     System.out.println(string2.replace(",",""));
		return string1.equals(string2);
	}

}
