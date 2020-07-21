package selfStudy1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DupRemove {

	public static void main(String[] args) {
      System.out.println(removeDup("AAABBBCCC"));
	}

	public static String removeDup(String string) {
		string = new TreeSet<String>(Arrays.asList(string.split(""))).toString();

	//	string = string.replace(", " ,  "" ).replace("[","").replace("]","");

		    return  string;

	}

}
