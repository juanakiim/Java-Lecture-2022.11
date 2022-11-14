package ch15_Collection.sec02_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList와 ArrayList 성능비교
 * 
 * @author juana
 *
 */

public class Ex01_Performance {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();

		// list 앞에 추가하는 것은 arraylist가 시간이 더 소요됨
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			al.add(0, String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간 : " + (endTime - startTime) + "nsec");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간 : " + (endTime - startTime) + "nsec");

	}

}
