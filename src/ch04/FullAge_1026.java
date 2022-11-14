package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class FullAge_1026 {

	public static void main(String[] args) {
		/*
		 * 만나이 계산하기
		 * 
		 * 생년월일을 입력으로 받아 오늘 현재 만나이를 구하세요 if문
		 */

		// 생년월일 받기 //

		Scanner scan = new Scanner(System.in);
		
		System.out.print("생년>");
		int bYear = scan.nextInt();
		System.out.print("생월>");
		int bMonth = scan.nextInt();
		System.out.print("생일>");
		int bDay = scan.nextInt();
		
		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println("생년월일 : " + birthDay);
		scan.close();

		
		
		// 현재 날짜구하기 //
		LocalDate today = LocalDate.now();
		System.out.println("오늘날짜 : " + today); // 오늘 날짜
		
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();

		int fullAge = 0; // 변수값 0으로 초기화 
		
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth)
			fullAge = tYear - bYear - 1;
		else {
			if (tDay >= bDay) // tMonth와 bMonth 가 같은 경우 //
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear - 1;
		}
		System.out.println("당신의 만나이는 " + fullAge + " 입니다.");
	}

}
