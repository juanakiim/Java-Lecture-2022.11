package ch04;

import java.util.Scanner;

public class Ex13_While { //몇번에 걸쳐서 끝날지 모를때 while 사용 //

	public static void main(String[] args) {

		/*
		 * 입력값
		 * 
		 * 정수입력 => 합이 100보다 작을때 까지 돌아가게하기 (Return?)
		 *
		 */

		Scanner scan = new Scanner(System.in);

		int sum = 0;
		while (sum < 100) {

			System.out.print("정수 입력 :  ");
			int num = scan.nextInt(); // 정수를 입력받겠다.
			sum += num;  // sum = sum + num 

		}

		System.out.println(sum);

		while (true) {

			// 탈출 조건을 따져야함 , 탈출조건에 부합하면 break해서 빠져나감

			sum = 0;
			System.out.print("정수 입력 :  ");
			int num = scan.nextInt(); // 정수를 입력받겠다.
			sum += num;
			if (sum >= 100)
				break;

		}
		System.out.println(sum);
		scan.close();
	}

}
