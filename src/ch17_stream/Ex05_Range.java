package ch17_stream;

import java.util.stream.IntStream;



public class Ex05_Range {
	
	public static int sum;
	public static void main(String[] args) {
		
		IntStream stream = IntStream.range(1, 10); // 1-9까지의 범위 
		stream.forEach(i-> System.out.println("range : " + i)); 
		System.out.println();
		
		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(i-> System.out.println("RangeClosed : " + i)); // 1-10까지의 범위 
		System.out.println();
		
		stream  = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);
		System.out.println("총합 :" + sum);
		
		
	}

}
