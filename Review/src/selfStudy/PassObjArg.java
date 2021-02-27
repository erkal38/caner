package selfStudy;

class Apple{
	String color;
}

public class PassObjArg {

	public static void main(String[] args) {
       Apple apple=new Apple();
       changeApple(apple);
       System.out.println(apple.color);
		
	}
    public static void changeApple(Apple apple) {
    	apple.color="green";
    }
}
