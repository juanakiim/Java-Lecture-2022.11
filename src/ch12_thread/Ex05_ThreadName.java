package ch12_thread;

public class Ex05_ThreadName {

	public static void main(String[] args) {

		Thread mainThread = Thread.currentThread();
		System.out.println("Main 쓰레드 이름 : " + mainThread.getName());

		Thread threadA = new Ex05_ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		

		Thread threadB = new Ex05_ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();

	}
}
