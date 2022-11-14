package ch13_generic.sec04_method;

public class MainPair {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util.<Integer, String> compare(p1, p2);
		System.out.println(result1);
		//true = p1과 p2가 논리적으로 동등한객체이다
		
		//pair가 제네릭이므로 타입을 마구 바꿔도 상관없음 
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		boolean result2 = Util.compare(p3, p4);
		System.out.println(result2);
		
		
	}

}
