package demos;

import java.util.function.Consumer;
import java.util.function.Function;

public class Funct {

	public static void main(String[] args) {
		Function<Integer,Integer>f=n->n*2;
		Function<Integer,Integer>f1=n->n*n*n;
		System.out.println(f.andThen(f1).apply(2));
		System.out.println(f.compose(f1).apply(2));
	}

}
