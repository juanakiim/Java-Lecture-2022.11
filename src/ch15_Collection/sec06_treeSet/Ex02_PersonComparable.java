package ch15_Collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex02_PersonComparable {
	public static void main(String[] args) {
		
		
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// 객체 저장 
		treeSet.add(new Person("홍길동",45));
		treeSet.add(new Person("김자바",25));
		treeSet.add(new Person("박자바",32));
		
		
	}
}
