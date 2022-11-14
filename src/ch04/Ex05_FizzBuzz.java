package ch04;

import java.util.Random; //import를 쓰면 라이브러리를 만들어낼 수 있음 
import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {

		
		/* 
		 * 양의 정수 ( 1 ~ 100)까지 주어짐
		 * 3의 배수일 경우 Fizz
		 * 5의 배수일 경우 Buzz 
		 * 3과 5의 배수면 FizzBuzz
		 * 아니며 바로 숫자 출력 
		 */
		
		
	     // 임의의 정수값을 생성 
		Random ran = new Random();
		
		int number = ran.nextInt(100) + 1; // 1에서 100까지의 임의의 정수값 생성 (0에서 99까지의 난수이므로 +1을 해줘야함)
		int result = number;
		
		
//		System.out.print("< 1에서 100까지 정수를 입력하세요. > ");
//		Scanner scan = new Scanner(System.in); // 객체 생성
//		int num = scan.nextInt();
//		number = num;
		
		 
		
		//범위가 가장 작은 것부터 하기 
		
		if(number % 3 == 0 && number % 5 == 0)
			System.out.println(number + ", FizzBuzz !!!"); 
		else if (number % 5 == 0)
			System.out.println(number + ", Buzz !!!");
		else if (number % 3 == 0 && number % 5 != 0)
			System.out.println(number + ", Fizz !!!");
		else 
			System.out.println(result);		
		
		
	}

}
