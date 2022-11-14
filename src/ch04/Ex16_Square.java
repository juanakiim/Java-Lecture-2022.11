package ch04;

import java.util.Scanner;

public class Ex16_Square {

	public static void main(String[] args) {

		/*
		 * 10보다 큰 정수를 입력받아 1부터 입력 받은 숫자까지의 제곱의 합과 합의 제곱을 구하세요
		 * 
		 * 1*1 + 2*2 + .... 12*12 ----> someOfSquare (1+2+...+12) * (1+2+...+12) --->
		 * squareOfSome
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("10보다 큰 정수를 입력하세요 : ");
			num = scan.nextInt(); }
		while (num<=10);
		scan.close();

		int sum = 0, sumOfSquare = 0;

		for (int i = 1; i <= num; i++) {

			sum += i; // 합을 구하기
			sumOfSquare += i * i; // 제곱의 합을 구하기

		}

		int squareOfSum = sum * sum;
		System.out.println("제곱의 합 : " + sumOfSquare);
		System.out.println("합의 제곱 : " + squareOfSum);
		
	}

}
