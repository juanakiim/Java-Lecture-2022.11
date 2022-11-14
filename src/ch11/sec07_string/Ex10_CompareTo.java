package ch11.sec07_string;

public class Ex10_CompareTo {

	public static void main(String[] args) {
		
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str3));

	}

}
