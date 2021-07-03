package officePractice02072021;

import java.util.Arrays;

public class PrintArrays {

	public static void main(String[] args) {
	    //  ! Create a static method name: acceptString
	//  It should accept 3 strings as parameter
	//  ! and print them as an array
	//  ! e.g. String[] array = { "sam", "john", "tom" };
	//  ! acceptString(“sam”,”john”,”tom”);
	//  ! Then output: [sam,john,tom]
        String name1="sam";
        String name2="john";
        String name3="tom";
        acceptString(name1,name2,name3);
	}

	public static void acceptString(String name1, String name2, String name3) {
        String[] array= {name1,name2,name3};
        System.out.println(Arrays.toString(array));
	}
	}

