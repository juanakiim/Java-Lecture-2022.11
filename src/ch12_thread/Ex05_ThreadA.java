package ch12_thread;

public class Ex05_ThreadA extends Thread { // thread 상속받음

	// 생성자 만듬
	public Ex05_ThreadA() {
		setName("ThreadA");
	}

	// run이라는 메소드 구현해줘야함
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			// 자기가 무엇인지 알려줌 
			System.out.println(getName() + "가 출력한 내용");
		}
	}

}
