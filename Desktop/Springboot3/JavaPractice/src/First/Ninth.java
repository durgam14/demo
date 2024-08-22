package First;

import java.util.stream.IntStream;

public class Ninth {

	public static void main(String[] args) {
		// Skip & limit example
		
		
		IntStream.rangeClosed(1, 10)
		.skip(1)
		.limit(8).forEach(System.out::println);
	}

}
