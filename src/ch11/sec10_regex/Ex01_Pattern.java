package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {

		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; // \\를 두개 써주면 하나의 글씨가됨 , 모바일전번
		String data1 = "032-2345-6789";
		String data2 = "010-234-9786";

		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);

		System.out.println(result1 + "," + result2);

		regExp = "(\\w|\\.)+@\\w+\\.\\w+(\\.\\w+)?";
		data1 = "juanakiim@naver.com";
		data2 = "ck.kim@naver.co.kr";

		boolean result3 = Pattern.matches(regExp, data1);
		boolean result4 = Pattern.matches(regExp, data2);

		System.out.println(result3 + "," + result4);

		regExp = "(\\w|\\.)+@\\w+\\.\\w+(\\.\\w+)?";
		data1 = "juanakiim@naver.com";
		data2 = "ck.kim@naver.co.kr";

		result3 = Pattern.matches(regExp, data1);
		result4 = Pattern.matches(regExp, data2);

		System.out.println(result3 + "," + result4);

	}

}
