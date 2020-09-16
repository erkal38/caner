package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MoveZer {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,0,3,4));
		 Iterator<Integer>list1=list.iterator();
		 while(list1.hasNext()) {
			 int val=list1.next();
			 if(val==0) {
				 list1.remove();
		 
		 }
	}
		 System.out.println(list.toString());
}
}
