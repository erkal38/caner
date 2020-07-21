package selfStudy1;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
      Map<String,String>dataMap=new HashMap<String, String>();
      dataMap.put("url","qa3.vytrack.com");
      dataMap.put("username","user66");
      dataMap.put("password","abc66");
      dataMap.put("browser","chrome");
      dataMap.put("truckdriver","Bob");
      
//      for (String value : dataMap.values()) {
//    	  System.out.println(value);
//		
      
//	}
//      for (String key:dataMap.keySet()) {
//    	  System.out.println(key+"|"+dataMap.get(key));
//		
	
	  dataMap.forEach((k,v)->System.out.println(k+"|"+v));
	
	}

}
