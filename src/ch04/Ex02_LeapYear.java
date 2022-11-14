package ch04;

/**
 * 연습문제
 * 
 * @author juana
 *
 */
public class Ex02_LeapYear {

	public static void main(String[] args) {

		/*
		 * 4의 배수면 윤년 100의 배수면 평년 400의 배수면 윤년
		 */

		// 풀이
		System.out.println("1996년은 " + leapYear2(1996) + "입니다");
		System.out.println("2000년은 " + leapYear2(2000) + "입니다");
		System.out.println("1900년은 " + leapYear2(1900) + "입니다");
		System.out.println("2022년은 " + leapYear2(2022) + "입니다");

	}

	private static String leapYear(int year1) {

		String result;
		if (year1 % 400 == 0)
			result = "윤년";
		else if (year1 % 4 == 0 && year1 % 100 != 0)
			result = "윤년";
		else
			result = "평년";
		return result;
	}

	private static String leapYear2(int year1) {

		String result;
		if (year1 % 400 == 0)
			return "윤년";
		else if (year1 % 4 == 0 && year1 % 100 != 0)
			return "윤년";
		return "평년";

	}
}
