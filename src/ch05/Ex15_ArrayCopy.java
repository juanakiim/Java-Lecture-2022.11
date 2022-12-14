package ch05;

import java.util.Arrays;

/*
 *  배열 복사 
 *  (별로 사용안함)
 * 
 */

public class Ex15_ArrayCopy {

	public static void main(String[] args) {
		
		int[] src = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] dst = new int[8];
		
		
		// src 값을 3~10까지 dst에 copy하려함//
		for(int i=2; i<=src.length; i++) 
			dst[i-2] = src[i];
		System.out.println(Arrays.toString(dst));
		
		String[] srcStrArray = {"A","quick","brown","fox"};
		String[] dstStrArray = new String[5];
		
		//srcStrArray를 dstStrArray [1]부터 복사 
		System.arraycopy(srcStrArray, 0, dstStrArray, 1, srcStrArray.length);
		System.out.println(Arrays.toString(dstStrArray));
		
		
		int[] newArray = Arrays.copyOf(dst, 0);
		System.out.println(Arrays.toString(newArray));
	
	}

}
