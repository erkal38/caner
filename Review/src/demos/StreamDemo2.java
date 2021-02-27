package demos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
      
		Set<String>fruites=new HashSet<String>();
		fruites.add("One apple");
		fruites.add("One mango");
		fruites.add("Two apples");
		fruites.add("More grapes");
		fruites.add("Two guavas");
		System.out.println(fruites.stream().anyMatch(value->{return value.startsWith("One");}));
		
		List<String>animalList=Arrays.asList("Dog","Cat","Elephant");
		List<String>birdList=Arrays.asList("peackock","parrot","crow");
		System.out.println(animalList.parallelStream().collect(Collectors.toList()));
		
		
		Stream<String>stream1=animalList.stream();
		Stream<String>stream2=birdList.stream();
		System.out.println(Stream.concat(stream1,stream2).collect(Collectors.toList()));
		
	}

}
