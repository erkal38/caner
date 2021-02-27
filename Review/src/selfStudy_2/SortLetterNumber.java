package selfStudy_2;

public class SortLetterNumber {

	public static void main(String[] args) {
		System.out.println(PassWordvalidation("Az;7894ad"));
	}

	public static boolean PassWordvalidation(String password) {

		String lowercase = "(.*[a-z].*)";

		String uppercase = "(.*[A-Z].*)";

		String numbers = "(.*[0-9].*)";

		String specialchars = "(.*[ -/, :-@].*)";
		boolean HasLower = password.matches(lowercase),

				HasUppere = password.matches(uppercase),

				HasDigits = password.matches(numbers),

				HasSpecial = password.matches(specialchars);

		boolean Valid = false;

		if (password.length() >= 6 && !password.contains(" "))

			if (HasLower && HasUppere && HasDigits && HasSpecial)

				Valid = true;
		return Valid;

	}

}
