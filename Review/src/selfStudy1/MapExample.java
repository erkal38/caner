package selfStudy1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		List<Integer>items2=new ArrayList<Integer>();
		items2.add(10);
		Map<String, Double>items=new HashMap<String, Double>();
		items.put("Apple",1.49);
		items.put("Flowers",3.49);
		items.put("eggs",2.49);
		items.put("Milk",5.49);
		items.put("Cherries",6.59);
		items.put("Nut",4.49);
		System.out.println(items.size());
		System.out.println(items.toString());
		System.out.println("Apple price= "+items.get("eggs"));
		items.remove("Flowers");
		System.out.println(items.toString());
		items.replace("eggs",4.00);
		System.out.println(items.get("eggs"));
		System.out.println(items.toString());
		items.replace("Cherries",2.00);
		System.out.println(items.toString());
		

	}

}
