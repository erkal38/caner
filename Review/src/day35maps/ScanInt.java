package day35maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ScanInt {

	public static void main(String[] args) {
    Scanner names=new Scanner(System.in);
    System.out.println("Enter 5 names");
    List<String>name1=new ArrayList<>();
    int i=1;
	String name;
    while (i<6) {
	name=names.nextLine();
	 i++;
	 System.out.println(name);
	 name1.add(name);	
	 //names=john Marry william Brian Richard
	}
	 System.out.println(name1);
	}
}