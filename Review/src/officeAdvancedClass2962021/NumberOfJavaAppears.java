package officeAdvancedClass2962021;

public class NumberOfJavaAppears {

	public static void main(String[] args) {
	  /*Write a method and calculate how many JAVA is typed on the string.
	   * Example intput str="javajavaxxxahmet"
	   */
		
	  String str="javajavaxxxahmet";
	  String str1="java";
	  dummy(str,str1);

}

	public static void dummy(String str,String str1) {
     		int num=(str.length()-(str.replace("java","")).length())/str1.length();
     		System.out.println("JAVA word is repeated= "+num+" times");
	}
}