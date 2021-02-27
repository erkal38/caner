package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatArrays {

	public static void main(String[] args) {
       List<Integer>array1=new ArrayList<Integer>(Arrays.asList(4,5,6,7));
       List<Integer>array2=new ArrayList<Integer>(Arrays.asList(8,9,10,11));
       List<Integer>concatArray=new ArrayList<Integer>();
       concatArray.addAll(array1);
       concatArray.addAll(array2);
       System.out.println(concatArray.toString());
       
	
	}

}
