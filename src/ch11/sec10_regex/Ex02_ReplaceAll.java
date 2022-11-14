package ch11.sec10_regex;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		
		String data = "나는 Java Programing이 좋아요 !!! ";
		
		System.out.println(data.replaceAll("[A-Z]", ""));// 알파벳 대문자 없애기 
		System.out.println(data.replaceAll("[a-z]", ""));// 알파벳 소문자 없애기 
		System.out.println(data.replaceAll("[^가-힣 ]", ""));// 한글과 공백만 남기고 모두 제거 

	}

}
