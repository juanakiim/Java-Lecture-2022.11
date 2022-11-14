package ch11.sec18_datetime;

public class Q02_practice02 {
	
	public static void main(String[] args) {
		for(int i =2; i<10000; i++) {
			if(isPerfectNumber(i))
			System.out.println(i);
		}
	}
	
	static boolean isPerfectNumber(int num) {
		int sumOfDivisors = 0;
		for(int i =1; i<num; i++) {
			if(num%1== 0) // i가 num의 약수 
				sumOfDivisors += i;
			
		}
		return num == sumOfDivisors;
		
	}
}
