package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfChar {

	public static void main(String[] args) {
		sumOfChar("123456");
	}

	public static void sumOfChar(String str) {
		int result = 0;

		List<String> str2 = new ArrayList<String>(Arrays.asList(str.split("")));
		System.out.println(str2.toString());
		for (String string : str2) {
			int num = Integer.parseInt(string);

			result = result + num;

		}
		System.out.println(result);
	}

}
