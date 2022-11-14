package ch04;

import java.util.Scanner;

public class Ex24_Diamond {

	public static void main(String[] args) {
		/*
		 * 완성된 다이아몬드그리기
		 * 
		 * num = 7 i = 1 ~ num/2 + 1 h = num/2 + 1 space = h-i * = 2*i -1
		 * 
		 * 
		 * 
		 * i : 1 ~ num/2 space : i * :
		 */

//		int num =7;
//		int half = num/2;
//		
//		for(int i=1; i<=half+1; i++) {
//			for(int k=1; k<=half-1; k++) 
//				System.out.print(" "); 
//			for(int k=1; k<=2*i-1; k++)
//				System.out.print("*");
//			System.out.println();
//			}
//		for(int i=1; i<=half; i++) {
//			for(int k=1; k<=i; k++) {
//				for(int k=1; k<=half*2-i;k++)]

	    int num = 7;
		int half = num / 2; // num이 9이면 half는 4
		for (int i = 1; i <= half + 1; i++) {
			for (int k = 1; k <= half - i+1; k++)
				System.out.print(" ");
			for (int k = 1; k <= 2 * i - 1; k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=1; i<=half; i++) {
			for(int k=1; k<=i;k++) 
				System.out.print(" ");
			for(int k=1; k<=2*(half-i)+1 ;k++)
				System.out.print("*");
			System.out.println();
		}

	}

}
