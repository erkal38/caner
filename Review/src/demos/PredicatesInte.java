package demos;

import java.util.Iterator;
import java.util.function.Predicate;

public class PredicatesInte {

	public static void main(String[] args) {
        Predicate<Integer>p=i->(i>10);
        System.out.println(p.test(20));
        Predicate<String>pr=s->s.length()>4;
        System.out.println(pr.test("ahme"));
        String names[]= {"David","Scott","Smith","John","Mary"};
        for (String name : names) {
        	 if(name.length()>4) {
        		System.out.println(name);
        	 }
			
		}
	}

}
