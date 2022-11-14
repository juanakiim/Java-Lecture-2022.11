package ch08;

public interface Ex01_RemoteControllable {
	
	// 상수가 올수있음 '(constant)
	public static int MAX_VOLUME = 10; //static final 생략
	public static final int MIN_VOLUME = 0;
	
	// 추상메소드 (가장많이쓰임)
	public void turnOn(); //abstract 생략
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	// default method (java 1.8부터 지원) - 클래스 객체의 인스턴스 메소드 
	public default void setMute(boolean mute) {
		if(mute) 
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
	
	
	// 정적메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
