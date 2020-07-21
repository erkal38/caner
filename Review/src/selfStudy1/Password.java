package selfStudy1;

public class Password {

	public static void main(String[] args) {
       System.out.println(password("1254i@235"));
	}

	public static boolean password(String str) {
		String lowercase="(.*[a-z].*)";
		String uppercase="(.*[A-Z].*)";
		String numbers="(.*[0-9].*)";
		String specialchars="(.*[-/,:-@].*)";
		
		boolean HasLower=str.matches(lowercase),
				HasUppere=str.matches(uppercase),
				HasSpecial=str.matches(specialchars),
				HasDigits=str.matches(numbers),
				Valid=false;
				
		if(str.length()>=6&&!str.contains(""))
			if(HasLower&&HasUppere&&HasDigits&&HasSpecial)
	        Valid=true;
		return Valid;

}
}