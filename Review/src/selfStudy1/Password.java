package selfStudy1;

public class Password {

	public static void main(String[] args) {
       System.out.println(password("125A4i@235"));
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
				Valid=true;
				
		if(str.length()>=6&&!str.contains(""))
			if(HasLower&&HasUppere&&HasDigits&&HasSpecial)
	        Valid=true;
		return Valid;

}
}