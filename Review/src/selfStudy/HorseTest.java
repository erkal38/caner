package selfStudy;

public class HorseTest {

	public static class Pegasus extends Horse implements Flyer {
	    public static void main(String[] args) {
	        Pegasus myApp = new Pegasus();
	        System.out.println(myApp.identifyMyself());
	    }
	}
}