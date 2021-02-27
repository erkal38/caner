package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZero {

	public static void main(String[] args) {
       List<Integer>zeroRemove=new ArrayList<Integer>(Arrays.asList(10,0,5,0,78,68,0));
       List<Integer>zeroRemoveNew=new ArrayList<Integer>();
        for (Integer integer : zeroRemove) {
			if(!integer.equals(0)) {
              zeroRemoveNew.add(integer);
			}
		}
        System.out.println(zeroRemoveNew);
       
	}
}
