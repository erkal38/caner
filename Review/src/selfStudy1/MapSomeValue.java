package selfStudy1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSomeValue {

	public static void main(String[] args) {
      List<Map<String,Object>>product=new ArrayList<Map<String,Object>>();
      Map<String,Object>pro=new HashMap<String,Object>();
      pro.put("Elma",40);
      pro.put("Armut",39.40);
      pro.put("Cilek",60.30);
      for(String key:pro.keySet()) {
    	  System.out.println(key+"=Fiyatini Giriniz?");
      }
      for(Object value:pro.values()) {
    	  System.out.println(value);
      }
      product.add(pro);
      System.out.println(product.toString());
	}

}
