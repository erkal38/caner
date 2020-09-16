package selfStudy1;

import java.util.Arrays;
import java.util.TreeSet;

public class SortLetterNumber {

	public static void main(String[] args) {
		Object obj="DC501GCCCA098911";
        TreeSet<Object>sort=new TreeSet<Object>(Arrays.asList(((String) obj).split(",")));
        System.out.println(sort);
	}

}
