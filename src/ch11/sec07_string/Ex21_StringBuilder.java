package ch11.sec07_string;

public class Ex21_StringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		sb.insert(4, 2);
		System.out.println(sb.toString());

		sb.setCharAt(4, '6'); // 4의 자리를 '6'으로 바꿈
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		System.out.println(sb.reverse().toString());

	}

}
