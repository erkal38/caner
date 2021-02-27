package selfStudy_2;

public class UniqueLetter {

	public static void main(String[] args) {
       
		System.out.println(unique("AAABBBCCCDDERGUN"));
	}

	public static String unique(String string) {
        String result="";
        int i=0;
        for (;i < string.length(); i++) {
        	int count=0;
			for (int j = 0; j < string.length(); j++) {
				if(string.charAt(i)==string.charAt(j)) {
					count++;
				}
			}
		  if(count==1) {
			 result+=string.charAt(i)+""; 
		  }
        }
		return result;
	}

}
