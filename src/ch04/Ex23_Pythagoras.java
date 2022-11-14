package ch04;

public class Ex23_Pythagoras {

	public static void main(String[] args) {

		/*
		 * a+b+c = 1000 a < b < c
		 * 
		 */

		for (int a = 1; a <= 333; a++) {
			for (int b = a + 1; b <= 499; b++) {
				int c = 1000 - a - b;
				if (c * c == a * a + b * b) {
					System.out.println(a + "," + b + "," + c);
					break;
				}

			}

		}
	}
}
