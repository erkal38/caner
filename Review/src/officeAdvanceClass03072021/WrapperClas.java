package officeAdvanceClass03072021;

public class WrapperClas {

	public static void main(String[] args) {
        /*Write a method and get this expression "WelcomeToCoreJavaClass" from given 
         * str="(((W&&&&e**_lco74me %T%o Co!@!$,,<r>e <J>>>>+av'''aClass888899.||}]"
         * 
         */
         String str="(((W&&&&e**_lco74me %T%o Co!@!$,,<r>e <J>>>>+av'''aClass888899.||}]";
         System.out.println(filter(str));
		
	}

	public static String filter(String str) {
        String sum="";
		for (int i = 0; i < str.length(); i++) {
	    if(Character.isAlphabetic(str.charAt(i))){
	    	sum+=str.charAt(i);
	    }
	}
		return sum;		
	
	}

}
