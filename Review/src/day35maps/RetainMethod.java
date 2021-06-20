package day35maps;
import java.util.ArrayList;
public class RetainMethod {
	public static void main(String[] args) {
      ArrayList<String>input1=new ArrayList<>();
      input1.add("Sofia");
      input1.add("Brad");
      input1.add("Ange");
      input1.add("John");
      input1.add("Emily");
      ArrayList<String>input2=new ArrayList<>();
      input2.add("sofia");
      input2.add("brad");
      input2.add("grace");
      input2.add("emily");
      input2.add("hazel");
      for (String string : input1) {
         for (String string2 : input2) {
			if(string2.equalsIgnoreCase(string)) {
				System.out.println(string2);
		}
		}
	}
	}

}
