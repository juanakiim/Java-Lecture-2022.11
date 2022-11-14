package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Ex02_Integer {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		list.stream()
		.filter(i-> i % 2 == 1)
		.map(i -> i * i)    //중간처리 여러개 사용가능
		.sorted()
		.forEach(i -> System.out.println(i));  //최종처리는 무조건 딱하나만.
		
	}

}
