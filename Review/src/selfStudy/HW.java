package selfStudy;

public class HW {

	public static void main(String[] args) {
       System.out.print(loop("Hi","Bye"));
       System.out.println(loop("Bye","Hi"));
                
	}

	public static String loop(String string, String string2) {
		
		return string.concat(string2);
	}

}
