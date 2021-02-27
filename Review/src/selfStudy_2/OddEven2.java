package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEven2 {

	public static void main(String[] args) {
     List<Integer>oddEven=new ArrayList<Integer>(Arrays.asList(4,5,6,7));
     oddEven.stream().filter(n->n%2==0).forEach(n->System.out.println(n+" Even number"));
     oddEven.stream().filter(n->n%2!=0).forEach(n->System.out.println(n+" Odd number"));
     
     
	}

}
