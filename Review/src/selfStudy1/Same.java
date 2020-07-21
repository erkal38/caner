package selfStudy1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Same {

	public static void main(String[] args) {
         System.out.println(same("nugre","lakdirim"));
	}

	public static boolean same(String str1, String str2) {
		str1=new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
		System.out.println(str1);
		str2=new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
		System.out.println(str2);
		
		return str1.equals(str2);


	}

}
