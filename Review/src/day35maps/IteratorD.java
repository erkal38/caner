package day35maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorD {

	public static void main(String[] args) {
        List<String>str=new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        System.out.println(str);
        for (String string : str) {
			string=string+"";
		}
        System.out.println(str);
        Iterator<String>it=str.iterator();
        while(it.hasNext()) {
        	it.next();
        	it.remove();
        }
	    System.out.println(str);
	}

}
