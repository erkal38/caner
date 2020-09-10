package selfStudy1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
      Queue<String>queue=new LinkedList<String>();
      queue.add("Mike");
      queue.add("Ozzy");
      queue.add("Jamal");
      queue.add("Asiya");
      System.out.println(queue.toString());
      System.out.println(queue.peek());
      System.out.println(queue.toString());
	}

}
