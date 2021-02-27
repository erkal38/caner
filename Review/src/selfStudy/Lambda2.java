package selfStudy;

import java.util.Arrays;
import java.util.List;

public class Lambda2 {
	interface lamb{
		int calistir(int y);
	}

	public static void main(String[] args) {
//		List<Integer> num = Arrays.asList(1, 2, 3, 5);
//		num.forEach(System.out::println);
        lamb l=x->x*x;
        System.out.println(l.calistir(5));
	}

}
