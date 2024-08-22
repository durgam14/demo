package First;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fifth {

	public static void main(String[] args) {
		// Find second highest number in  given array
		
		
		int[] number = {5,9,11,2,8,21,1};
		
		Integer num = Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(num);

	}

}
