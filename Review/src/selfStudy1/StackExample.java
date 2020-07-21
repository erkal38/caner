package selfStudy1;

import java.util.Stack;
import java.util.Vector;

public class StackExample {

	public static void main(String[] args) {
      Vector<Integer> numsStack=new Stack<Integer>();
      numsStack.add(50);
      numsStack.add(70);
      numsStack.add(500);
      numsStack.add(40);
      System.out.println(numsStack.toString());
      System.out.println(((Stack<Integer>)numsStack).peek());
      System.out.println(((Stack<Integer>)numsStack).pop());
      System.out.println(numsStack.toString());
      
	}

}
