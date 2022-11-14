package ch15_Collection.sec06_treeSet;

public class Person implements Comparable {

	public String name;
	public int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		if(!(o instanceof Person))
		return 0;
		Person p = (Person) o;
		return age - p.age; // 나이이름 오름차순 정렬
	
	}

}
