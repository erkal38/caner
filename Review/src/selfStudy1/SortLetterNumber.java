package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class SortLetterNumber {

	public static void main(String[] args) {
		Object obj="DC501GCCCA098911";
        List<Object>sortElement=new ArrayList<Object>(Arrays.asList(((String) obj).split("")));
        System.out.println(Collections.frequency(sortElement,"C"));
        System.out.println(sortElement);
	}

}
