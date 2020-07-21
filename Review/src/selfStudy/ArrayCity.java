package selfStudy;

import java.util.ArrayList;

public class ArrayCity {

	public static void main(String[] args) {
   ArrayList<String> cities=new ArrayList<String>();
   cities.add("London");
   cities.add("Berlin");
   cities.add("IStanbul");
   cities.add("Atine");
   cities.add("Madrid");
   System.out.println(cities.toString());
   
   for (String string : cities) {
	System.out.println(string);
}
	int idx=cities.indexOf("Atine");
	System.out.println(idx);
	
	}

}
