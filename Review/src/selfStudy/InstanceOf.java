package selfStudy;

public class InstanceOf {

	public static void main(String[] args) {
       
		Animal a=new Dog();
		if(new Dog() instanceof Dog) {
			System.out.println("it is dog");
		}else
			System.out.println("it is not dog");
		
	}

}
