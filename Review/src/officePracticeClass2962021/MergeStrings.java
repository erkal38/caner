package officePracticeClass2962021;

public class MergeStrings {

	public static void main(String[] args) {
		/*Write a method to merge given two strings char by char.
		 * Example string1="jv",string2="aa",
		 *         output=java
		 */
		String string1="jv",string2="aa";
		merge(string1,string2);
	}

	public static void merge(String string1, String string2) {
		String str="";
		for(int i=0;i<=string1.length()-1;i++) {
			str=""+string1.charAt(i)+string2.charAt(i);
			System.out.print(str);
		}
	}

}
