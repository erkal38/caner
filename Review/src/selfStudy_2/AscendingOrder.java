package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class AscendingOrder {

	public static void main(String[] args) {
		TreeSet<Integer>sirala=new TreeSet<Integer>(Arrays.asList(4,78,56,23,45,14));
		System.out.println(sirala);
		List<Integer>sirala2=new ArrayList<Integer>(Arrays.asList(45,15,65,98,89));
		sirala2.sort(Comparator.naturalOrder());
		System.out.println(sirala2);
		
	}

} 
