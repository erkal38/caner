package selfStudy;

public class DoWhile {

	public static void main(String[] args) {
       int i=0;
       outer: 
         do {
        	 i=8;
        	 while(true) {
        		 System.out.println(i--);
        		 if(i==4) {
        			 break outer;
        		 }
        	 }
    	   
         }while(true);
	}

}
