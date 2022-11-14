package ch11.sec18_datetime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex05_Comparison {

	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.of(2022, 11, 4, 9,0);
		System.out.println(startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023, 3,8,18,0);
		System.out.println(endDateTime);
		
		System.out.println(startDateTime.isBefore(endDateTime));
		System.out.println(startDateTime.isAfter(endDateTime));
		
		System.out.println(startDateTime.until(endDateTime, ChronoUnit.DAYS));
		
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

	}

}
