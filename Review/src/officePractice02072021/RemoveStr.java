package officePractice02072021;

public class RemoveStr {
public static void main(String[] args) {
	/*Write a method with given two strings following,then see on the console only JAVA
	 * string="bad JAVA"
	 * string2="bad"
	 * OUTPUT =JAVA
	 */
	 
	String string="bad JAVA";
	String string2="bad";
	remove(string,string2);
	
}

public static void remove(String string, String string2) {
    System.out.println(string.replace(string2,"").trim());	
}
}
