package ch12_thread;

import java.awt.Toolkit;

public class Ex04_MultiTHREADLambda {

	public static void main(String[] args) throws InterruptedException {
		// code 집어넣어줄 수 있음
		Thread thread = new Thread(() -> { // Lambda Expression (=람다식, 화살표함수), 익명구현객체

			Toolkit toolkit = Toolkit.getDefaultToolkit();

			for (int i = 0; i < 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}

			}

		});

		// thread 구현
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000); // 1초씩 중지
		}
	}

}
