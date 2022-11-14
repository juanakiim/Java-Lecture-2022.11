package ch15_Collection.sec03_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ex02_MemberHashSet {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		Member member1 = new Member("홍길동", 30);
		Member member2 = new Member("홍길동", 30);
		System.out.println(member1.hashCode() + "," + member2.hashCode());
		System.out.println(member1.equals(member2));
		
		
		
		
		
	}

}
