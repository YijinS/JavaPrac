package chap04;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	
	public static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = IntStream.rangeClosed(1,100);
		intStream.forEach(a-> sum += a);
		System.out.println("รัวี: " + sum);
		
	}

}
