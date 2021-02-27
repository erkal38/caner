package selfStudy1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListColl {

	public static void main(String[] args) {
   List<Integer> myInt=new LinkedList<Integer>(Arrays.asList(4,5,7,8,9,12));
   myInt.addAll(4,Arrays.asList(30,40));
   System.out.println(myInt);
   myInt.replaceAll(each->each+5);
   System.out.println(myInt);
   myInt.sort(Comparator.reverseOrder());
   System.out.println(myInt);
   System.out.println(myInt.subList(3,myInt.size()));
   System.out.println(myInt.remove(3));
   System.out.println(myInt);
	}

}
