package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SelectMax {

	public static void main(String[] args) {
        List<Integer>selectMax=new ArrayList<Integer>(Arrays.asList(78,45,96,41,23));
       /* selectMax.sort(Comparator.reverseOrder());
       System.out.println(selectMax.get(0));*/
        int max=Integer.MIN_VALUE;
        for (Integer integer : selectMax) {
			if(integer>max) {
				max=integer;
			}
		}
	    System.out.println(max);
	}

}
