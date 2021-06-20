package day35maps;

import java.util.Arrays;
import java.util.List;

public class ArrayContains {

	public static void main(String[] args) {
    arrayContain(6);
	}

	public static boolean arrayContain(int a) {
		List<Integer>num=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(a);
		return num.contains(a);
	}
}
