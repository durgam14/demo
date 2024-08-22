package First;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		//find each char count the occurrence
		
		String name = "Thisisthejavatpoint";
		
		
Map<String, Long> count = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("These are the each char count : " + count);


Map<String , Long> count1= Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(count1);

	}

}

