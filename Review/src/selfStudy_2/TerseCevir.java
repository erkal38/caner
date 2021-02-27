package selfStudy_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TerseCevir {

	public static void main(String[] args) {
       System.out.println(rever("NUGRE"));
	}

	public static String rever(String string) {
		StringBuffer str=new StringBuffer(string);
		return str.reverse().toString();
	
	
	}
}
