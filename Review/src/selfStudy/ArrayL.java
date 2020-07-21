package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayL {

	public static void main(String[] args) {
      ArrayList<String> names=new ArrayList<String>();
      ArrayList<Integer> num=new ArrayList<Integer>();
      names.add("Mike");
      names.add("Tomas");
      num.add(99);
      num.add(52);
      num.add(40);
      System.out.println(names.get(0));
      System.out.println(num.get(1));
      System.out.println(names.size());
      System.out.println(num.size());
      System.out.println(names.toString());
      System.out.println(num.toString());
      Integer n2=Integer.valueOf(52);
      num.remove(n2);
      System.out.println(num.toString());
	}

}
