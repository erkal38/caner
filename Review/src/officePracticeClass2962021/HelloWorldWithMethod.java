package officePracticeClass2962021;

public class HelloWorldWithMethod {

	public static void main(String[] args) {
		/*Write a program to see on the console "Hello World!" by using two different methods
		*/
		hello();
	}

	public static void world() {
		System.out.println("World!");
	}

	public static void hello() {
		System.out.print("Hello ");
		world();
	}
}
