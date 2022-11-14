package ch10;

public class Ex05_TryCatch {
	
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개변수가 부족합니다.");
			System.out.println("사용법 : 매개변수로 값2개를적으세요");
		}
		
		try { 
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("잘못된숫자");
		} finally {
			System.out.println("다시실행하세요");
		}
	}

}
