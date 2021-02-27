package demos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {

	public static void main(String[] args) {
		List<Integer>sortedLis=Arrays.asList(2,5,4,1,8,6);
		Collections.sort(sortedLis);
		System.out.println(sortedLis);
		System.out.println(sortedLis.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
	}

}
