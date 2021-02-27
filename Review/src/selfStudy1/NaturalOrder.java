package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class NaturalOrder {

	public static void main(String[] args) {
     TreeSet<Integer>nums=new TreeSet<Integer>(Arrays.asList(5,7,4,78,50));
     System.out.println(nums);
     System.out.println(nums.size());
     for (Integer integer : nums) {
    	 System.out.println(integer);
	
	}
	}
}
