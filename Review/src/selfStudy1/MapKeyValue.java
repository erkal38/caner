package selfStudy1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue {

	public static void main(String[] args) {
         TreeMap<String,Object> value=new TreeMap<String,Object>();
         value.put("Ahmet",40);
         value.put("Mehmet",38);
         value.put("Ergün",39);
         System.out.println(value.get("Ahmet"));
         value.remove("Ergün");
         System.out.println(value.toString());
         
         
         
	}

}
