package demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
       List<Integer>lst1=Arrays.asList(1,2);
       List<Integer>lst2=Arrays.asList(3,4);
       List<Integer>lst3=Arrays.asList(5,6);
       List<Integer>lst4=Arrays.asList(7,8);
       
       List<List<Integer>>sumList=Arrays.asList(lst1,lst2,lst3,lst4);
       System.out.println(sumList);
       sumList.stream().flatMap(x->x.stream()).map(n->n%2==0).forEach(System.out::println);
		 
	}

}
