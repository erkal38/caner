package techproed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DoubleMatch {

	public static void main(String[] args) {
		String str = "ilovetoojava";
		String[] arr = str.split("");
		Arrays.sort(arr);
		List<String> list = new ArrayList<>();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1].equals(arr[i])) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
				
			
		}
System.out.println(list);
}

}