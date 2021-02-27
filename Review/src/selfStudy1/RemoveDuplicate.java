package selfStudy1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
        unique("AAABBCCC./,DEF");
	}

	public static void unique(String string) {
		string=new HashSet<String>(Arrays.asList(string.split(""))).toString();
		System.out.println(string);
	}
	
}
	