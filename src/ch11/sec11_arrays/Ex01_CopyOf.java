package ch11.sec11_arrays;

import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {

		// 방법 1
		char[] src = { 'J', 'A', 'V', 'A' };
		char[] dst = Arrays.copyOf(src, src.length); // 몇개를 복사할건지 = src.length
		System.out.println(Arrays.toString(dst));

		// 방법 2
		dst = Arrays.copyOfRange(dst, 1, 3);
		System.out.println(Arrays.toString(dst));

		// 방법 3, 받는 배열의 기억장소가 확보되어야 함 
		char[] newDst = new char[4]; // 배열 선언후 에러막기
		System.arraycopy(src, 0, newDst, 0, src.length);
		System.out.println(Arrays.toString(dst)); // exception 발생 (위에 방법2때문에 길이가 2인데 실행시키면 에러발생)

		src[0] = 'j';
		newDst[1] = 'a';
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(newDst));

	}
}
