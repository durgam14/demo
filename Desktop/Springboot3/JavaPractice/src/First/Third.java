package First;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Third {

	public static void main(String[] args) {
		//find unique elements from given string
		
		String name = "ilovejavatechie";
		
		
		List<String> unique = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(q->q.getValue()==1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("These are the Unique elements " + unique);
				
	}

}
