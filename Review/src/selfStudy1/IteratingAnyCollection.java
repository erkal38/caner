package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

	public static void main(String[] args) {
     Collection<Integer>coll=new ArrayList<Integer>(Arrays.asList(3,4,2,5,66,544,31));
     System.out.println(coll);
    Iterator<Integer>myIter=coll.iterator();
    myIter.next();
    myIter.remove();
    System.out.println(coll);
     }
	

}
