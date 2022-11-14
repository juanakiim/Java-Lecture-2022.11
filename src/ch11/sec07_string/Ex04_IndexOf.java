package ch11.sec07_string;

public class Ex04_IndexOf {
	
	public static void main(String[] args) {
		
		String str = "자바 프로그래밍";
		
		int index = str.indexOf("프로그래밍");
		System.out.println(index); // 3이나온다는건 자바 공백다음 0,1,2, 3의자리에 프로그래밍 시작
		
		//찾고자 하는 문자열이 대상 문자열에 있는경우 리턴값은 0이상 
		
		if(str.indexOf("자바")>=0)
			System.out.println("자바 포함");
		else // 사실은 -1을 리턴
			System.out.println("자바 불포함");
		
	}
}
