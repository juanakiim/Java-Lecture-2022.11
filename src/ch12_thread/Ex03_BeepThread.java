package ch12_thread;

import java.awt.Toolkit;

public class Ex03_BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 소리 다섯번 울리고 콘솔창에 글씨5번출력 ( 동시불가 )
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}
	}
}
