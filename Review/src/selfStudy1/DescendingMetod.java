package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingMetod {

	public static void main(String[] args) {
      List<Integer>num=new ArrayList<Integer>(Arrays.asList(10,15,2,8,7,9));
      num.sort(Comparator.naturalOrder());
      System.out.println(num);
      for(int i=0;i<num.size();i++) {
    	  for(int j=0;j<num.size();j++) {
    		  if(num.get(i)>num.get(j)) {
    			  Integer dummy=num.get(i);
    			  num.set(i, num.get(j));
    			  num.set(j, dummy);
    		  }
    	  }
      }
	  System.out.println(num);
	}

}
