package ch04;

import java.util.Scanner;

public class Ex12_FizzBuzz02 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0)
				System.out.print("FizzBuzz !!!");
			else if (i % 5 == 0)
				System.out.println(" Buzz !!!");
			else if (i % 3 == 0 && i % 5 != 0)
				System.out.println("Fizz !!!");
			else
				System.out.println(i + " ");

		}

	}

}
