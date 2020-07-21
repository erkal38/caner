package selfStudy;

public class Hihi {

	public static void main(String[] args) {
         System.out.println(repeatStr("Hi",2));
         String dummy=repeatStr("Hi", 5);
         System.out.println(dummy);
	}

	public static String repeatStr(String string, int number) {
         String str = "";
         for(int i=0;i<number;i++) {
           str=str+string;
         }  
        return str;
	}

}
