package ch11.sec07_string;

import java.util.Scanner;

class Q05_CaesarCipher {

	public static void main(String[] args) {

		/*
		 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른알파벳으로 바꾸는 암호화 방식을 시저암호라고 한다. 예를 들어 "AB"는 1만큼 밀면
		 * "BC"가 되고
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("문장입력> : ");
		String plainText = scan.nextLine();
		System.out.println("스텝 > ");
		int step = scan.nextInt();
		scan.close();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);
		System.out.println(cipher2plain(cipherText, step));
	}

	/* 암호화 */
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i); /// char의 i번째값을 끄집어 오는것
			if (c == ' ') {
				cipherText[i] = c;
				continue;
			}
			char d = (char) (c + step);
			if (d > 'Z')
				d = (char) (d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}

	/* 복호화 */
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i); /// char의 i번째값을 끄집어 오는것
			if (c == ' ') {
				plainText[i] = c;
				continue;
			}
			char d = (char) (c - step);
			if (d < 'A')
				d = (char) (d + 26);
			plainText[i] = d;
		}
		return new String(plainText);
	}
}
