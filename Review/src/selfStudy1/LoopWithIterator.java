package selfStudy1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopWithIterator {

	public static void main(String[] args) {
		 List<Integer>nums=new ArrayList<Integer>();  
	     nums.add(50);
	     nums.add(543);
	     nums.add(1150);
	     nums.add(550);
	     nums.add(507);
	     nums.add(90);
	     nums.add(5000);
	     nums.add(950);
	     Iterator<Integer>it=nums.iterator();
	     System.out.println(it.hasNext());
	     System.out.println(it.next());
	     System.out.println(it.next());
	     System.out.println(it.next());
	     //System.out.println("===========");
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }

	}

}
