package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

	public static void main(String[] args) {
      List<Integer>some=new ArrayList<Integer>(Arrays.asList(1,2,5,100,200,60,78,150));
      some.removeIf(n->n>=100);
      System.out.println(some);
	}

}
