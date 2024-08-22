package First;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fourth {

	public static void main(String[] args) {
		
		//find first non repeat element from string
		
		String name ="ilovejavatechie";
		
		String firstNonRepeat = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,  Collectors.counting()))

				.entrySet().stream()
				.filter(i->i.getValue()==1)
				.findFirst().get().getKey();
		System.out.println("firstNonRepeat"+firstNonRepeat);
		
		
		
		String firstRepeat = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,  Collectors.counting()))

				.entrySet().stream()
				.filter(i->i.getValue()>1)
				.findFirst().get().getKey();
		System.out.println("firstNonRepeat"+firstRepeat);
		
		

	}

}
