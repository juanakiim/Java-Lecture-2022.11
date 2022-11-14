package ch06;

public class Ex01_Method {

	public static void main(String[] args) {

		int min = getMinimum(3, 4, 5);
		System.out.println(min);

		System.out.println(getMinimum(10, 20, 5));
		System.out.println(getMinimum(100, 83, 145));
	}
	// static 은 static 밖에 부르지 못함

	static int getMinimum(int a, int b, int c) {

		// 프로그램 로직 작성
		// a와 b사이에 최솟값
		// 위에 min과 현재 min은 완전 다른것

		int min = (a < b) ? a : b;
		min = (min > c) ? c : min;
		return min; // 최솟값 반환
	}
}
