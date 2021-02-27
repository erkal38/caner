package selfStudy1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class UniqueValue {

	public static void main(String[] args) {
		 String str = "accabbcdef";
		   Map<Object,Integer> unique=new TreeMap<Object, Integer>();
		   for(int j=0;j<str.length();j++) {
			   int count=0;
			   for(int i=0;i<str.length();i++) {
				   if(str.charAt(i)==str.charAt(j)) {
					   count++;
				   }
			   }
		      if(count==1) {
		    	  unique.put(str.charAt(j),count);
		      }
		   }

		System.out.println(unique);
	}

}
