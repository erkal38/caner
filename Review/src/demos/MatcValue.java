package demos;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MatcValue {

	public static void main(String[] args) {
       Set<String>fruites=new HashSet<String>();
       fruites.add("One apple");
       fruites.add("Two mangos");
       fruites.add("One cucumber");
       fruites.add("Three bananas");
       fruites.add("More grapes");
	   fruites.stream().anyMatch(value->{return value.startsWith("One");});
	}

}
