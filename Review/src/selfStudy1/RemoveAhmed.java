package selfStudy1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {

	public static void main(String[] args) {
	List<String>names=new ArrayList<String>(Arrays.asList("Ahmed","John","Eric","Veli"));
	   Iterator<String>it=names.iterator();
	   names.remove("Ahmed");
	   System.out.println(names);
	}

}
