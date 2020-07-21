package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Coll {

	public static void main(String[] args) {
		
      Collection<Integer>coll=new ArrayList<Integer>();
      coll.add(3);
      coll.add(3);
      coll.add(10);
      coll.add(30);
      System.out.println(coll);
      coll.addAll(Arrays.asList(4,5,7,9));
      System.out.println(coll);
      System.out.println(coll.size());
      System.out.println(coll.contains(100));
      System.out.println(coll.removeAll(Arrays.asList(4,10,9)));
      System.out.println(coll);
      System.out.println(coll.removeIf(each->each==10));
      System.out.println(coll);
	}

}
