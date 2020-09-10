package selfStudy1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
        unique("AAABBCCC./,DEF");
	}

	public static void unique(String string) {
		string=string.replace("./,","");
       Set<String>str=new HashSet<String>(Arrays.asList(string.split("")));
       System.out.println(str);
	}
	
}
	