package selfStudy;

public class TryCatch {

	public static void main(String[] args) {
       try {
           String str="Java";
           System.out.println(str.charAt(0));
           System.out.println(str.charAt(4));
           System.err.println(str.charAt(1));
    	   
    	   
	} catch (Exception e) {
		System.out.println("Exception happened in try block and was caught");
	}
	}

}
