package ch03;

/**
 * 이항연산자
 * @author juana
 *
 */


public class EX03_Binary {

	public static void main(String[] args) {
		
		int a = 2000000000;
		int b = a * 2;
		System.out.println(b);
	    System.out.printf("%d , %d%n", Integer.MAX_VALUE , Integer.MIN_VALUE);
	    
	    int c = 3, d = 4; //동일한 타입일 경우 ,를 사용하면됨 
	    int res1 = c/d ;
	    
	    System.out.println(res1); // 정수형이라 0.75라는 값이 0으로 출력됨 
	    
	    double res2 = c/d;
	    System.out.println(res2); //연산결과가 0, 이후에 실수 변환
	    double res3 = c/(double)d;
	    System.out.println(res3);  //연산할때 실수 변환, 올바른 결과 도출 
	    
	   System.out.println(Double.NaN); // 0.0을 0.0으로 나눔
	   System.out.println(Double.POSITIVE_INFINITY); // 3.0을 0.0으로 나눔 (양수나눔)

	   
	   /*비교연산자*/
	   
	   System.out.println("비교연산자 : " + (3 == 3));
	   System.out.println("비교연산자 : " + (3.5 == 3.3)); // 실수연산에서 같으냐 비교하는것은 위험 
	   System.out.println(Math.abs(3.0 - 1.2+3.3-1.)< 1e-15); // 차이의 절댓값이 1E-15보다 
	   
	   /*문자열비교*/
	   
	   String str1 = "홍길동";  // 리터럴로 문자열 할당 (heap memory 상에 들어감)
	   String str2 = "홍길동";
	   String str3 = new String("홍길동");	   // 문자열 객체를 만든것 (stack memory 에 들어감) 
	   System.out.println(str1 + str2 + str3 );
	   System.out.println(str1 == str2); // 동일하게 리터럴이 저장되어 있는 곳을 가리킴 
	   System.out.println(str1 == str3);  // 결과값이 false, 이유는 다른 기억장소에 보관되어있기 때문 
	   System.out.println(str1.equals(str3));  // 올바른 비교방법 
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
	private static int safeAdd(int x, int y) {
		if(y > Integer.MAX_VALUE - x )
		   return 0;
		return x + y;
	
	}

}
