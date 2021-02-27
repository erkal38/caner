package demos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		
		List<String> vehicleListArr = Arrays.asList("car", "bus", "vehicle", "bycle", "bike", "bus");
		System.out.println(vehicleListArr);
        System.out.println(vehicleListArr.stream().distinct().collect(Collectors.toList()));
        vehicleListArr.stream().distinct().forEach(action->System.out.println(action));
        System.out.println(vehicleListArr.stream().distinct().count());
        System.out.println(vehicleListArr.stream().limit(3).collect(Collectors.toList()));
       
          List<Integer>numberList=Arrays.asList(3,5,7,9,10);
          System.out.println(numberList);
          System.out.println(numberList.stream().filter(num->num%2!=0).count());
          System.out.println(numberList.stream().min((val1,val2)->{return val1.compareTo(val2);}).get());
        
	      numberList.stream().max((val1,val2)->{return val1.compareTo(val2);});
	      List<String>stringList=Arrays.asList("A","B","C","1","2","3","4");
	     System.out.println(stringList.stream().reduce((value,combinedvalue)->{return value+combinedvalue;}).get());
	      Object arr[]=stringList.stream().toArray();
	      System.out.println(arr.length);
	      for (Object object : arr) {
			System.out.println(object);
		  }
	      List<Integer>list1=Arrays.asList(2,4,3,7,9,5);
	      System.out.println(list1.stream().reduce((value,combinedValue)->{return value+combinedValue;}).get());
	      System.out.println(list1.stream().sorted().collect(Collectors.toList()));
	      System.out.println(list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}

}
