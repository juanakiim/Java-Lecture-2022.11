package ch12_thread;

public class Ex05_ThreadB extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 2; i++) {
			// 자기가 무엇인지 알려줌
			System.out.println(getName() + "가 출력한 내용");
		}

	}

}
