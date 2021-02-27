package techproed;

public class StringMani {

	public static void main(String[] args) {
     String str="   Ayse123 kaya/%  ";
     System.out.println(str.trim().replace("/%","").replace("123","").toUpperCase());
	}

}
