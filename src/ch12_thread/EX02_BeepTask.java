package ch12_thread;

import java.awt.Toolkit;
/*
 * // 실행시킬 코드 넣기 
 */
public class EX02_BeepTask implements Runnable {

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
