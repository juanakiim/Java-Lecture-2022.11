package ch12_thread;

public class Ex02_MultiThreadRunnable {

	public static void main(String[] args) throws InterruptedException {

		
		//화면, 소리 동시에 이루어짐 
		Runnable beepTask = new EX02_BeepTask();
		Thread thread = new Thread(beepTask);

		thread.start(); // thread 실행 

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000); // 1초씩 중지
		}

	}

}
