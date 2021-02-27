package demos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceCombine {

	public static void main(String[] args) {
       List<String>combined=Arrays.asList("E","E","R","R","G","U","N"," ","6","7","2");
       Optional<String>reduced=combined.stream().distinct().reduce((k,v)->{
    	                         return k+v;
                                });
       System.out.println(reduced.get());
       }
	}
