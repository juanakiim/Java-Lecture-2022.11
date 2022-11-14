package ch04;

public class Ex22_Star {

	public static void main(String[] args) {

		/*
		 * 
		 * 별모양으로 다이아몬드 그리기
		 * 
		 */

		int num = 5;

		// 1사분면
		System.out.println("1사분면");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 4사분면
		System.out.println("4사분면");
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		/*
		 * 2사분면 i = 1~5 space = num - i * = i번만큼
		 */

		System.out.println("2사분면");
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("*");
			System.out.println();
			
		}

			/*
			 * 3사분면
			 * 
			 * i= 5~1
			 * 
			 * space : num -i
			 * 
			 * * : i
			 * 
			 */

			System.out.println("3사분면");
			for (int i = num; i >= 1; i--) {
				for (int k = 1; k <= num - i; k++)
					System.out.print(" ");
				for (int k = 1; k <= i; k++)
					System.out.print("*");
				System.out.println();

			}
		}

	}

