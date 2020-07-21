package selfStudy1;

import java.util.HashSet;
import java.util.Set;


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
     nums.forEach(n->System.out.print(n+" |"));
     
	}
    
}
