package selfStudy_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SelectMin {

	public static void main(String[] args) {
      TreeSet<Integer>selectMin=new TreeSet<Integer>(Arrays.asList(78,65,12,56,89));
      System.out.println(selectMin);
      System.out.println(selectMin.pollFirst());
	
	}

}
