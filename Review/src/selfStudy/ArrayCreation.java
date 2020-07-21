package selfStudy;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
      String[] season=new String[3];
      season[0]="Jan";
      season[1]="Feb";
      season[2]="March";
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter index number");
      int index=sc.nextInt();
      System.out.println("Season:"+season[index]);
	}

}
