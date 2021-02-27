package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {

	public static void main(String[] args) {
		 List<Integer>nums=new ArrayList<Integer>(Arrays.asList(50,40,500,60));  
	     nums.add(50);
	     nums.add(543);
	     nums.add(1150);
	     nums.add(550);
	     nums.add(507);
	     nums.add(90);
	     nums.add(5000);
	     nums.add(950);
	     Collections.sort(nums,Collections.reverseOrder());
	     System.out.println(nums);
	     Collections.sort(nums,Comparator.naturalOrder());
	     System.out.println(nums);
	     Iterator<Integer>it=nums.iterator();
    while(it.hasNext()) {
	    	 int i=0;
    	System.out.println(it.next());
    	}
          List<Person>plst=new ArrayList<Person>();
          plst.add(new Person("John",20));
          plst.add(new Person("Adam",32));
          plst.add(new Person("Mary",10));
          System.out.println(plst);
          Collections.sort(plst);
          System.out.println(plst);
          
          
	}

}
