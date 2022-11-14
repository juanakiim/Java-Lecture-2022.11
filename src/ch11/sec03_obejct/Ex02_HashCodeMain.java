package ch11.sec03_obejct;

import java.util.HashMap;

public class Ex02_HashCodeMain {

	public static void main(String[] args) {

		// key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체를 생성
		HashMap<Key, String> hashMap = new HashMap<>();

		// 자료넣기
		hashMap.put(new Key(1), "James");
		hashMap.put(new Key(2), "Maria");

		// KEY cLASS에서 hashCdoe Method를 재정의하기 이전
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode()); // hashcode의 키값이 다름
		String value = hashMap.get(new Key(1));
		System.out.println(value);

		// Key Class에서 hashCode method를 재정의
		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode()); // hashcode의 키값이 다름
		value = hashMap.get(new Key(1));
		System.out.println(value);
		System.out.println(hashMap.get(new Key(2)));
	}

}
