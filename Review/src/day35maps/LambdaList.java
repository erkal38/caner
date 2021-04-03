package day35maps;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

	public static void main(String[] args) {
     List<Integer>num=new ArrayList<>();
     num.add(12);
     num.add(15);
     num.add(5);
     num.add(16);
     printFiveCombination(num);
     
	}

	public static void printFiveCombination(List<Integer> num) {
      num.stream().filter(t->t%5==0).forEach(t->System.out.println(t));	
	  num.stream().filter(t->t%5==0).map(t->t*t).forEach(t->System.out.println(t));
	}

}
