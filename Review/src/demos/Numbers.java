package demos;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Numbers {

	public static void main(String[] args) {
      int a[]= {5,10,15,20,25,30,35,40,45,50,55,60};
      Predicate<Integer>p1=i->i%2==0;
      Predicate<Integer>p2=i->i>50;
      for (int j : a) {
		if(p1.test(j)&&p2.test(j)) {
			System.out.println(j);
		}
	}
	}

}
