package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * 배열에 값 할당하기
 * 
 * @author juana
 *
 */

public class Ex12_Assign {

	public static void main(String[] args) {

		// 주사위를 10번 던진 결과를 dice 배열에 집어넣기

		int[] dice = new int[10];
		Random ran = new Random();
		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1; // --->1 ~6 표시

		}
		System.out.println(Arrays.toString(dice));

		// 학생 30명의 시험 점수에 51점 ~ 100점까지 값을 집어넣고 평균구하기

		int[] score = new int[30];
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(50) + 51;
			sum += score[i];
		}
		System.out.println((double) sum / score.length); /// 평균을 구하기위해서는 하나의 타입을 double로 바꿔줘야함

		// 1줄에 5명의 성적이 출력

		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			if ((i + 1) % 5 == 0)
				System.out.println();
			else
				System.out.print(" ");
		}

	}

}
