package officeAdvancedClass2962021;

public class NumberOfJavaAppears {

	public static void main(String[] args) {
	  /*Write a method and calculate how many JAVA is typed on the string.
	   * Example intput str="javajavaxxxahmet"
	   */
		String str="javajavaxxxergun";
		dummy(str);
	}

	public static void dummy(String string) {
       	int num=(string.length()-(string.replace("java","")).length())/4;	
		System.out.println("input= "+string);
		System.out.println("output= "+num);
	}

}
