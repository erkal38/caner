package selfStudy1;

import java.util.Random;

public class RandomClass {
      public static void main(String[] args) {
		System.out.println(rnd(50));
	}

	public static int rnd(int i) {
        Random rn=new Random();
        int random=rn.nextInt(60)+1;
        if(random==i) {
        	System.out.println("random=sayi");
        }
		return random;
	}
}
