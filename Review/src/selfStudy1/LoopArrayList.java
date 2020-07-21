package selfStudy1;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {

	public static void main(String[] args) {
     List<Integer>nums=new ArrayList<Integer>();  
     nums.add(50);
     nums.add(543);
     nums.add(1150);
     nums.add(550);
     nums.add(507);
     nums.add(90);
     nums.add(5000);
     nums.add(950);
	 for (Integer n : nums) {
		System.out.print(n +" |");
	}
	 System.out.println();
	 nums.removeIf(n->n<500);
	 System.out.println(nums);
	} 
   
}