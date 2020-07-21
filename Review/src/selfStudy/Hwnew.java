package selfStudy;

public class Hwnew {
	public Hwnew() {
		System.out.println("Hwnew");
	}

}
class B extends Hwnew{
	public B() {
		System.out.println("B");
	}
}
class C extends B{
	public C() {
		System.out.println("C");
	}
   public static void main(String[] args) {
	   
	   C c=new C();
	   c.toString();
   }
}