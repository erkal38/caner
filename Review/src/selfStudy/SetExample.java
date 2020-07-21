package selfStudy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
       Set<Integer> mySet=new HashSet<Integer>();
       mySet.add(100);
       mySet.add(500);
       mySet.add(800);
       mySet.add(900);
       System.out.println(mySet.toString());
       System.out.println(mySet.size());
	   List<String>list=Arrays.asList("ergun","kaldirim","baskent","Ankara","aa","aa","apt");
	   System.out.println(list);
	   Collection<String>unique=new TreeSet<String>(list);
	   System.out.println(unique);
	   
	   
	}

}
