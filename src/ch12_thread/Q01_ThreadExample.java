package ch12_thread;

/*
 * p.633 확인문제 2
 */
public class Q01_ThreadExample {
	
	public static void main(String[] args) {
		//  동영상재생 
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread();
		thread2.start();
	}

}
