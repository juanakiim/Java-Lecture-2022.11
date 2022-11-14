package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		
		String s1 = "홍길동";   //리터럴로 작성한 "홍길동"은 공통으로 사용이됨 
		String s2 = "홍길동";
		System.out.println(s1 == s2); //true, 동일한 기억장소를 가리킴 
		
		String s3 = new String("홍길동");  //'new + 생성자'로 만든 "홍길동"은 다른 장소에 보관됨 
		String s4 = new String("홍길동");
		
		System.out.println(s3 == s4);  //false, 별도의 기억장소를 가짐.
		
		
		// 값이 같은지 물어볼 경우에는 equals method 사용 
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
		
		
		
		
		
	}

}
