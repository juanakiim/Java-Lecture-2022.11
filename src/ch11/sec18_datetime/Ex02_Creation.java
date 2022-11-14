package ch11.sec18_datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Ex02_Creation {

	public static void main(String[] args) throws InterruptedException {

		// 날짜 2022-11-04
		LocalDate today = LocalDate.now();
		System.out.println(today);

		// 지정날짜
		LocalDate examDay = LocalDate.of(2022, 11, 17);
		System.out.println(examDay);

		// 시간 ( 시 : 분: 초 . 나노세컨)
		LocalTime curTime = LocalTime.now();
		System.out.println(curTime);

		// 지정 시간
		LocalTime lunchTime = LocalTime.of(11, 50);
		System.out.println(lunchTime);

		// 날짜 + 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		LocalDateTime christmas = LocalDateTime.of(2022, 12, 25, 0, 0);
		System.out.println(christmas);

		// Timezone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));// 우리나라 시간
		System.out.println(seoulDateTime);
		
		//timestamp
		Instant is1 = Instant.now();
		Thread.sleep(10);
		Instant is2 = Instant.now();
		System.out.println(is1.until(is2, ChronoUnit.NANOS)); // 두개의 시간차이 확인 nano단위 
		System.out.println(is1.isBefore(is2));

	}

}
