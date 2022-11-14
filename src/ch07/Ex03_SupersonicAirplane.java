package ch07;

public class Ex03_SupersonicAirplane extends Ex03_Airplane {

	/*
	 * 상수 설정 Normal : 1 Supersonic :2
	 */

	// 상수값 설정
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	int flymode = NORMAL;

	@Override
	public void fly() {
		if (flymode == SUPERSONIC)
			System.out.println("초음속 비행합니다.");
		else
			super.fly();
	}

}
