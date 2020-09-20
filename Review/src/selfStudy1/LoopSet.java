package selfStudy1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class LoopSet {

	public static void main(String[] args) {
     Set<Integer>nums=new HashSet<Integer>();
     nums.add(50);
     nums.add(555);
     nums.add(5000);
     nums.add(543);
     nums.add(150);
     nums.add(90);
     nums.add(5000);
     TreeSet<Integer>num=new TreeSet<Integer>(nums);
     nums.forEach(n->System.out.print(n+" |"));
     System.out.println();
     num.forEach(k->System.out.print(k+"||"));
     
	}
    
}
