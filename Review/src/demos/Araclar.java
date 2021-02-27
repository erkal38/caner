package demos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
public class Araclar {
	public static void main(String[] args) {
		List<String>arac=Arrays.asList("bus","car","bicycle","train");
		System.out.println(arac.stream().map(name->name.toUpperCase()).collect(Collectors.toList()));
	    arac.stream().map(vname->vname.length()).forEach(System.out::println);
	}
           
}
