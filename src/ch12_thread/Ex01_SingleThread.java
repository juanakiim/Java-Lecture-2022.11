package ch12_thread;

import java.awt.Toolkit;

public class Ex01_SingleThread {

	public static void main(String[] args) throws InterruptedException {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		
		//소리 다섯번 울리고 콘솔창에 글씨5번출력 ( 동시불가 ) 
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			Thread.sleep(1000); // 밀리세컨드단위로 쉬게하는것 (1000 ms만큼 중지)
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000); //1초씩 중지 
		}
	}

}
