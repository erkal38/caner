package selfStudy1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class SetHash {

	public static void main(String[] args) {
     Set<Integer> nums=new HashSet<Integer>();
     nums.add((int) 7L);
     nums.add((int) 155L);
     nums.add((int) 7L);
     nums.add((int) 10f);
     nums.add(25);
     System.out.println(nums);
     System.out.println(nums.size());
     for (Integer integer : nums) {
		System.out.println(integer);
	}
     
	}

}
