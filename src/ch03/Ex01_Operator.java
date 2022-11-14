package ch03;


/** ---> 클래스에 대한 공식적인 설명문 쓸때 별 두개 (파란색으로 나오게)  
 * 연산자(Operator) 
 * */

public class Ex01_Operator {

	public static void main(String[] args) {
		
		// 증감연산자 
		
		int a = 3; 
		int b = a++;  //post increment 
		System.out.printf("a = %d, \tb = %d\n", a , b);
		
		// \n , %n = new line 이라는 의미 (줄구분), \t 는 tab 기능 
		
		int c = ++a;  // pre increment 
		System.out.printf("a = %d, \tc = %d%n", a , c);
		
		// 삼항연산자 
		String s = (a % 2 == 0) ? "짝수" : "홀수";
		System.out.println(a + "은/는 " + s );
		
		
		int sum = 0;
		sum += 1; 
		sum += 2; 
		System.out.println(sum);
		
		sum = 0;
		for ( int i =1; i<=10; i++) {
			
			sum += i;
		}
        System.out.println("1부터 10의 합은 : " + sum);
        
        
        short s1 = 1;
        /* short ss = -s1 ;  오류발생) 단항연산자를 -를하면 결과가 int type이됨 */ 
        short ss = (short)-s1;
        
	}

}
