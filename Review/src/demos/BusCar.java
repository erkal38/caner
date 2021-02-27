package demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BusCar {

	public static void main(String[] args) {
		int d2[]= {2,5,7};
		int count=Integer.valueOf("5");
		System.out.println(count+5);
      List<String>vehicles=Arrays.asList("bus","car","bycle","bus","car","bike");
      System.out.println(Arrays.binarySearch(d2,5));
     List<String>vehicList= vehicles.stream().distinct().collect(Collectors.toList());
	 System.out.println(vehicList.stream().distinct().count());	
     System.out.println(vehicList);
     
     List<Integer>numberList=Arrays.asList(2,3,4,5,6,7,8,9);
    Optional<Integer>nal=numberList.stream().min((value1,value2)->{
    	                                   return value1.compareTo(value2);                                    
     });
     System.out.println(nal.get());
     System.out.println(numberList.stream().filter(x->x%2==0).count());
     
	}

}
