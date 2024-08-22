package First;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Second {

	public static void main(String[] args) {
		
		//find duplicate elements from given string
		
		
		String name = "ilovethejavatechie";
	
//		List<String> duplicates = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				.entrySet().stream()
//				.filter(w->w.getValue()>1)
//				.map(Map.Entry::getKey)
//				.collect(Collectors.toList());
//		System.out.println("these are the duplicates elements " + duplicates);
		
		
		
		
		List<String> duplicates = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))

				.entrySet().stream()
				.filter(s->s.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(duplicates);
				
		
	}

}
