package ch06;

/*
 *  method over loading 
 */
public class Ex03_Overload {

	public static void main(String[] args) {

		int min = getMinimum(3, 4, 5);
		System.out.println(min);

		System.out.println(getMinimum(10., 20., 5.));
		System.out.println(getMinimum(100, 83, 145));
		System.out.println(getMinimum(5, 28));
	}
	
	static int getMinimum(int a, int b) {
		return getMinimum(a, a, b);
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

	// 메소드의 이름은 언제든 동일한 이름 사용 가능, 하지만 return type은 같을 수 없음
	static double getMinimum(double a, double b, double c) {

		// 프로그램 로직 작성
		// a와 b사이에 최솟값
		// 위에 min과 현재 min은 완전 다른것

		double min = (a < b) ? a : b;
		min = (min > c) ? c : min;
		return min; // 최솟값 반환
	}
}
