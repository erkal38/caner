package demos;

import java.util.function.Consumer;

public class Consum {

	public static void main(String[] args) {
       Consumer<String> c1=s->System.out.println(s+" "+"is White");
       Consumer<String> c2=s->System.out.println(s+" "+"is having four legs");
       Consumer<String> c3=s->System.out.println(s+" "+"is eating honey");
       
       c1.accept("Cow");
       c2.accept("Sheep");
       c3.accept("bee");
       c1.andThen(c2).andThen(c3).accept("Sheep");
		
		
	}

}
