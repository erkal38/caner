package techproed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
      List<Integer>listArraycon=new ArrayList<>();
      listArraycon.add(15);
      listArraycon.add(20);
      System.out.println(listArraycon);
      Object[]list2=listArraycon.toArray();
      System.out.println(Arrays.toString(list2));
		
	}

}
