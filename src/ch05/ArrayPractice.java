package ch05;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		/**
		 * 두개의 양의 정수를 커맨드 아규먼트로 입력받아서 공약수를 찾아서 배열에 넣어보세요.
		 */

		// 1. 두개의 양의 정수를 아규먼트로 입력받아 각각 num1, num2 변수에 넣기
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		System.out.println("두개의 양의정수" + num1 + "," + num2);

		// 2. 두 수중 작은 수만큼 for - loop을 돌면서 num1,num2로 나누어 지는지 확인

		int num3 = (num1 < num2) ? num1 : num2;
		System.out.println("더 작은 수 : " + num3);

		// num1 , num2가 나눠지는지 확인
		for (int i = 1; i <= num3; i++)
			if (num1 % i == 0) {
				System.out.println("num1의 약수는 : " + i);
			}
		System.out.println("=================================");
		for (int k = 1; k <= num3; k++) {
			if (num2 % k == 0) {
				System.out.println("num2의 약수는 : " + k);
			}
		}
	}

	
	
//		 3. 찾은 수를 배열로 만들기
//		 1) 배열을 작은 수 만큼의 크기로 만들기
//		 2) 스탭2에서 걸러진 공약수를 배열에 넣는다.
//		 3) 공약수의 갯수 만큼 새로운 배열에 넣기

	
	int[] arr = {1,2,4,5,10,20};
}
