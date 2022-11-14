package ch11.sec18_datetime;

import java.util.Random;

public class Q01_practice01 {

	public static void main(String[] args) {
		
		// 주사위 랜덤값 받기 
		Random random = new Random();
	
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위 눈 : " + num1 + "," +  num2 + "," + num3);
		System.err.printf("상금 : %,d%n", prize);
		
	
}
	
	private static int getPrize(int num1,int num2,int num3) {
		if(num1 == num2 && num2 == num3) {
			return 10000 + num1 * 1000;
		}
		if(num1 == num2 || num2 == num3 || num1 == num3) {
			if(num2 == num3) {
				return 1000 + num2 * 100;
			}
				return 1000 + num1 * 100;
			}
		int max = num1;
		if(max < num2)
			max = num2;
		if(max < num3)
			max = num3;
		return max * 100;
	}
}
