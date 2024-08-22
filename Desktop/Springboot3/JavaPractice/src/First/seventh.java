package First;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class seventh {

	public static void main(String[] args) {
		// find element from array whose start with 1
		
		
		int[] number = {5,9,11,2,8,21,1};
		
		List<String> stringList = Arrays.stream(number)
				.boxed()
				.map(s->s + "")
				.filter(s->s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(stringList);
	}

}
