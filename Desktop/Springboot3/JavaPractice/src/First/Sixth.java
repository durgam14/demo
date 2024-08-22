package First;

import java.util.Arrays;

public class Sixth {

	public static void main(String[] args) {
		// find longest string from given array
		
		
		String[] name = {"java","techie","springboot","microservices"};
		
		
		String longString = Arrays.stream(name).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
		System.out.println(longString);

	}

}
