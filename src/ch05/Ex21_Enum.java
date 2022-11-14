package ch05;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 열거타입 (Enumeration 타입)
 * 
 * @author juana
 *
 */
public class Ex21_Enum {
	// public enum 열거타입이름 { 상수 = 상수는 대문자로};
	public enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	};

	public static void main(String[] args) {

		Week today = Week.THU;
		System.out.println(today.name());
		System.out.println(today.ordinal()); // 열거객체의 순번 (0부터 시작~)
		System.out.println(today.compareTo(Week.TUE)); // 비교 (ORDINAL 값에서 해당값 빼기 3-1 = 2)
		System.out.println(today.compareTo(Week.SAT)); // 비교 (3-5 = -2)

		Week day = Week.valueOf("SAT"); // 문자열을 준다음 문자열에서 매치가되는 열거 상수중 하나를 그 값으로 잡아서 작업
		System.out.println(day.ordinal());

		System.out.println(Arrays.toString(Week.values())); /// 배열 출력

		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfWeek());

	}

}
