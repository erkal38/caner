package selfStudy_2;

public class FrekansAyar {

	public static void main(String[] args) {
      
		System.out.println(str("EEERRGGGUUNNNN"));
		
	}

	public static String str(String string) {
        String result="";
       
        int i=0;
        for (; i < string.length(); i++) {
        	int count=0;
        	for (int j=0; j < string.length(); j++) {
				if(string.charAt(i)==string.charAt(j)) {
					count++;
				}
			}
			result+=string.charAt(i)+""+count;
			string=string.replace(""+string.charAt(i),"");
		}
		
		
		return result;
	}

}
