package ch06;

/**
 * 배열에서 사용하면 좋을 법한 프로그램을 메소드로 만들기
 * 
 * @author juana
 *
 */

public class Ex02_ArrayMethod {

	public static void main(String[] args) {

		int[] intArray = { 43, 24, 46, 89, 3, 24, 90, 101 };
		printArray(intArray);
		int min = getMin(intArray);
		System.out.println(min);
		System.out.println(getAvg(intArray));

		int[] intArray2 = { 23, 7, 63, 59, 37, 89, 100, 34, 57, 45 };
		printArray(intArray2);
		System.out.println(getMin(intArray2));
		System.out.println(getAvg(intArray2));

	}

	static double getAvg(int[] arr) {
		
		// sum을 먼저 구함
		int sum = 0;

		for (int a : arr) // enhanced for 사용
			sum += a;

		return (double) sum / arr.length;
	}

	static int getMin(int[] arr) {
		int min = arr[0];
		for (int element : arr)
			if (min > element)
				min = element;
		return min;
	}

	// return 값이없을 때 void 사용
	static void printArray(int[] arr) { // 매개변수의 이름은 다른게 일반적(이름은 관계없음) , 타입은 반드시 일치 해야함

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if ((i + 1) % 4 == 0 || (i + 1) == arr.length)
				System.out.println();

		}
	}
}
