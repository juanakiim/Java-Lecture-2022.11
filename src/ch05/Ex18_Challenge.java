package ch05;

import java.util.Arrays;

public class Ex18_Challenge {

	public static void main(String[] args) {

		// 1. 두개의 양의 정수를 아규먼트로 입력받아 각각 num1,num2 변수에 넣기
		if (args.length != 2) {
			System.out.println("사용법 : 두개의 양의 정수를 입력하세요 : ");
			System.exit(1);
		}

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]); // 아그스는 문자열이기 때문에 integer.parseint라는 형식으로 씀
		System.out.println(num1 + "," + num2);

		// 2. 두수중 작은 수만큼 for-loop을 돌면서 num1,num2로 나누어지는지 확인

		int min = (num1 < num2) ? num1 : num2;

		for (int i = 1; i <= min; i++) {

			if (num1 % i == 0 && num2 % i == 0)
				System.out.println("공약수 : " + i);
		}

		/*
		 * 찾은 수를 배열로 만들어라. 1) 배열을 작은 수 만큼의 크기로만듬 2) 스탭2에서 걸러진 공약수를 배열에 넣기 3) 공약수의 갯수만큼
		 * 새로운 배열에 넣기
		 */

		// 1) 배열을 작은 수 만큼의 크기로만듬
		int[] tmp = new int[min];
		int index = 0;

		// 2) 걸러진 공약수를 배열에 넣기
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				tmp[index++] = i;
		}
		System.out.println(index);
		System.out.println(Arrays.toString(tmp));

		// 3) 공약수 갯수만큼 새로운 배열에 넣기
		int[] commonDivisors = Arrays.copyOf(tmp, index); // arrays.copyOf = 배열복사
		System.out.println(Arrays.toString(commonDivisors)); // arrays.toString = 배열 내용 출력하기

	}

}
