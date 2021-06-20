package day35maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class LambdaNameList {

	public static void main(String[] args) {
      List<String>name=new ArrayList<>();
      name.add("Ali");
      name.add("Veli");
      name.add("Ayþe");
      name.add("Fatma");
      name.add("Ahmet");
      name.add("Mustafa");
      printListWithA(name);
      printListWithAandE(name);
      printListSorted(name);
      printListSortedLength(name);
      
	}

	public static void printListSortedLength(List<String> name) {
     name.stream().sorted(Comparator.comparing(t->t.length())).map(t->t+":"+t.length()).forEach(t->System.out.println(t+" "));		
	}

	public static void printListSorted(List<String> name) {
    name.stream().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t->System.out.println(t+" "));		
	}

	public static void printListWithAandE(List<String> name) {
	name.stream().filter(t->t.startsWith("A")&&t.endsWith("e")).forEach(t->System.out.println(t));		
		
	}

	public static void printListWithA(List<String> name) {
    name.stream().filter(t->t.startsWith("A")).forEach(t->System.out.println(t));		
	}

}
