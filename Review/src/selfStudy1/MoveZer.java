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
		List<Integer>num=new ArrayList<Integer>();
		 for(int i=0;i<list.size();i++) {
			 Integer element=list.get(i);
			 if(element!=0) {
				 num.add(element);
		 }
		 }
		 num.add(num.size(),0);
		 System.out.println(num.toString());
}
}
