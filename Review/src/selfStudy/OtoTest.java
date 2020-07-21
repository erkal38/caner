package selfStudy;

public class OtoTest extends Object {

	public static void main(String[] args) {
      Oto c= new Oto();
      c.model="m3";
      c.year=2017;
      c.engine=5.3;
      System.out.println(c);
      System.out.println(c.hashCode());
	}

}
