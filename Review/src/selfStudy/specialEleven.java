package selfStudy;

public class specialEleven {

	public static void main(String[] args) {
       special(22);
       special(23);
       special(24);
	}

	public static void special(int number) {
          if(number%11==0 || number%11==1) {
        	  System.out.println(true);
          }else {
        	  System.out.println(false);
          }
	}

}
