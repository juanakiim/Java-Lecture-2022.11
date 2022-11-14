package ch02;

public class Ex01_Var {
	
	public static void main(String[] args) {
		
		int score = 90; //90 = literal 리터럴 
		int result = score * 2; 
		
		System.out.println(result);
		
		
		/* Literal */
		
		int intLiteral = 30;  // 정수 literal 
		int octal = 036; //8진수 (octal)
		int hexa = 0x1E; // 16진수 (hexadecimal)
		System.out.printf("%d, %d, %d\n",intLiteral, octal, hexa);
		
		double doubleLiteral = 3.14159; // 실수 literal --> floating point(실수)
		char charLiteral = 'a'; // 문자 literal --> single quote (문자, 글자 1개 ) 
		String strLiteral = "A quick brown fox";  //문자열 
		boolean boolLiteral = true;  // true or false만 존재함 
		
		
		
		if (result > 100 ) { 
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1); ---> 현재에서는오래갈수 없다 
	}
}
