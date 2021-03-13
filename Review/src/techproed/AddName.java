package techproed;

public class AddName {

	public static void main(String[] args) {
       String name1="mehmet";
       String name2="ahmet";
       if(name1.length()%2==0) {
    	 String newWord=name1.substring(0, (name1.length()/2)).concat(name2);
    	 System.out.println(newWord.concat(name1.substring(name1.length()/2)));
       }else {
    	   System.out.println("Name2 cannot be inserted in the name1");
       }

		
	}

}
