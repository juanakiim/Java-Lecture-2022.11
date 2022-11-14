package ch11.sec18_datetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ex04_Operation {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime target = now 
				.plusYears(3)
				.minusMonths(8)
				.minusDays(3)
				.minusHours(2)
				.plusMinutes(10);
		System.out.println(target);

		
		// 상대 변경
		target = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(target);
		
		target = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(target);
		target = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println(target);
		// --->다음 돌아오는 월요일 
	}

}
