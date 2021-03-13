package techproed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharAInWord {

	public static void main(String[] args) {
      char c1='a';
      char c2;
      int num=0;
      String sentence="John came late";
      for(int i=0;i<sentence.length();i++) {
    	 c2=sentence.charAt(i);
    	 if(c2==c1) {
    		 num++;
    	 }
      }
	  System.out.println("number of a= "+num);
	}
	}
