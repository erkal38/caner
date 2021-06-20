package day35maps;

import java.util.ArrayList;
import java.util.List;

public class LambdaList {

	public static void main(String[] args) {
     List<Integer>num=new ArrayList<>();
     num.add(12);
     num.add(15);
     num.add(5);
     num.add(5);
     num.add(16);
     printFiveCombination(num);
     System.out.println(printMaxValue(num));
     System.out.println(printMinValue(num));
	}

	public static Integer printMinValue(List<Integer> num) {
		return num.stream().distinct().reduce(Integer.MAX_VALUE, (x,y)->x<y?x:y);
	}

	public static Integer printMaxValue(List<Integer> num) {
     return num.stream().distinct().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);
      
	}

	public static void printFiveCombination(List<Integer> num) {
//    num.stream().filter(t->t%5==0).forEach(t->System.out.println(t));	
//	  num.stream().filter(t->t%5==0).map(t->t*t).forEach(t->System.out.println(t));
//	  num.stream().filter(t->t%5==0).distinct().map(t->t*t).forEach(t->System.out.println(t));
//	  num.stream().filter(t->t%2!=0).distinct().forEach(t->System.out.print(t+" "));
//	  System.out.println();
//	  num.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t+" "));
	 
	}

}
