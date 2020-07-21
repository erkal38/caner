package selfStudy1;

import java.util.*;

public class SortAsc {

	public static void main(String[] args) {
       List<Integer> sirala = new ArrayList<Integer>(Arrays.asList(4,5,62,75,60,80));
       Collections.sort(sirala,Collections.reverseOrder());
       
       System.out.println(sirala.get(sirala.size()-1));
	}

}
