package day35maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterReverse {

	public static void main(String[] args) {
      List<String>str=new ArrayList<>();
      str.add("XY");
      str.add("ZT");
      str.add("UV");
      ListIterator<String>lit=str.listIterator();
      while (lit.hasNext()) {
		lit.next();
	}
      while (lit.hasPrevious()) {
       String str1=lit.previous();
       System.out.print(str1+" ");
      }
	}

}
