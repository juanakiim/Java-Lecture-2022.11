package ch06;

public class Ex15_Main {

	public static void main(String[] args) {

		// 정석 코딩
		System.out.println(Ex15_Static.pi);

		int two0fTen = Ex15_Static.power(2, 10);
		System.out.println(two0fTen);

		System.out.println(Ex15_Static.circleArea(10.));

		// static member(field,method) 는 객체를 생성해서 사용하는것이 바람직하지 않음
		Ex15_Static st = new Ex15_Static();
		System.out.println(st.pi);

		st.x = 10;
		System.out.println(st.power2());
	}

}
