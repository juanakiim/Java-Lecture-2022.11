package ch04;

/**
 * IF 조건문
 * 
 * @author juana
 *
 */

public class Ex01_if {

	public static void main(String[] args) {

		// 단일 IF

		int number = 20;

		if (number % 5 == 0) {

			System.out.println("1. " + number + "은/는 5의 배수입니다.");

		}

		if (number % 7 == 0)// 실행문이 한개일 경우 { } 생략가능
			System.out.println("2. " + number + "은/는 7의 배수입니다.");

		// if - else 문

		if (number % 2 == 0)
			System.out.println("3. " + number + "은/는 짝수입니다.");
		else
			System.out.println("4. " + number + "은/는 홀수입니다.");

		String evenOdd;
		if (number % 2 == 0)
			evenOdd = "짝수";
		else
			evenOdd = "홀수";
		System.out.println("5. " + number + " 은/는" + evenOdd + " 입니다.");

		String evenOdd1 = "짝수";
		if (number % 2 == 1)
			evenOdd1 = "홀수";
		System.out.println(number + "은/는" + evenOdd1 + "입니다.");

		
		// 삼항연산자

		String evenOdd2 = (number % 2 == 0) ? "짝수" : "홀수";
		System.out.println(number + "은/는" + evenOdd2);

		// if - else if - else

		int score = 82;
		String grade;

		if (score >= 90 && score <= 100)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 6)
			grade = "D";
		else
			grade = "F";

		System.out.println("당신의 성적은 " + grade + "입니다.");

	}

}
