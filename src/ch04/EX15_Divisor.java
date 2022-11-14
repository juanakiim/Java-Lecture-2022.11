package ch04;

import java.util.Scanner;

public class EX15_Divisor {

	public static void main(String[] args) {
		/*
		 * 10 보다 큰 정수를 입력으로 받아 약수(divisor)를 찾아주는 프로그램을 작성하세요
		 * 
		 * 12 num 1=i (if num % i ==0 )
		 * 
		 */

		/*
		 * 내가한고 !!!!!!!!!!!!!!! Scanner scan = new Scanner(System.in);
		 * System.out.println("10이상의 정수를 입력하세요 : " ); int num = scan.nextInt();
		 * 
		 * int i = 0; for(i=1; i<=num; i++) {
		 * 
		 * if (num % i == 0 ) System.out.println(i + "는 " + num + "의 약수 입니다.");
		 * 
		 * }
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("10보다 큰 정수를 입력하세요 : ");
			num = scan.nextInt();
			if (num > 10)
				break;
		}scan.close();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i);

		}

	}
	

}
