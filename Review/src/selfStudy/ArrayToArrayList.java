package selfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
      String[]str= {"a","b","c","d","e"};
    //  List<String>list=Arrays.asList(str);
   //   System.out.println(list);
        List<String> list=new ArrayList<String>(); 
        Collections.addAll(list, str);
        System.out.println(list);
	}

}
