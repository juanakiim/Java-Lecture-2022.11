package ch04;

import java.util.Scanner;

/**
 * 반복문
 * 
 * @author juana
 *
 */

public class Ex11_For {

	public static void main(String[] args) {

		/*
		 * for문 : 대부분 사용 , 반복 횟수를 아는 경우 사용함 
		 * while 문 : 반복횟수를 정하기가 어려울때 사용 
		 * do-while문 : 실전에서 거의 사용하지 않음
		 * 
		 * 
		 * 
		 * for(int i =1; i<=100; i++) { 초기값 , 이조 건이 참인 동안 반복, 반복할 때 마다 변경되는 값 }
		 * 
		 * for (int i=0 ; i<100 ; i++ ) { } // 100번 반복함
		 */

		// 1에서 100까지의 합

		int sum = 0;
		for (int i = 1; i <= 100; i++)

			sum += i;  // sum = sum + i 와 같음 
		System.out.println(sum);

		// 1에서 100까지의 곱
		int product = 1;
		for (int i = 1; i <= 10; i++)
			product *= i; //product = product * i 
		System.out.println(product);

		// 사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기

		Scanner scan = new Scanner(System.in);
		String line = ""; // 빈문자열로 초기화해두기

		for (int i = 0; i < 5; i++) { // 5회반복 (0~4까지)

			System.out.print("입력하세요 : ");
			String inputStr = scan.nextLine(); // 한줄단위로 읽는것
			line += inputStr + " ";

		}
		System.out.println(line);
	}

}
