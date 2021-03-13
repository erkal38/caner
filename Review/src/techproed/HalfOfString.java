package techproed;

public class HalfOfString {
	public static void main(String[] args) {
		System.out.println(str("python"));
	}

	public static String str(String string) {
		return string.length() % 2 == 0 ? string.substring(0, string.length() / 2) : "String is odd number";
	}
}
