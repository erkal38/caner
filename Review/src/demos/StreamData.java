package demos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamData {

	public static void main(String[] args) {
      List<Integer> numberList=Arrays.asList(10,15,20,25,30);
      List<Integer>evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
      System.out.println(evenNumberList);
      numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
      numberList.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}