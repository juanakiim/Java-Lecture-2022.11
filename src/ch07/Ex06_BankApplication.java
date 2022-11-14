package ch07;

import java.util.Scanner;

public class Ex06_BankApplication {

	private static Ex06_Account[] accountArray = new Ex06_Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int index = 0;

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택 >");

			int selectNo = Integer.parseInt(scanner.nextLine());

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
			case 5:
				run = false;
				break;

			default:
				System.out.println("warning : 1 - 5 까지의 숫자를 입력하세요 ");
			}
		}

		System.out.println("프로그램 종료");
	}

	// 출금
	private static void withdraw() {
		System.out.println("------------------");
		System.out.println("출금");
		System.out.println("------------------");

		System.out.print("계좌번호 > ");
		String ano = scanner.nextLine();
		System.out.print("출금액 > ");
		int amount = Integer.parseInt(scanner.nextLine());
		Ex06_Account account = findAccount(ano); // 계좌찾기
		if (account == null) {
			System.out.println("!!!!!!!!!!! 계좌번호를 확인하세요.!!!!!!!!!!");
			return;
		}
		int balance = account.getBalance() - amount;
		if (balance >= 0) {  //balance가 영보다 크면 출금이 되고 작으면 잔액부족 msg
			account.setBalance(balance);
			System.out.println("** 출금이 완료되었습니다. ** ");
		} else {
			System.out.println("!!!!!!!!!!! 잔액이 부족합니다 !!!!!!!!!!");
		}
	}

	// 예금
	private static void deposit() {
		System.out.println("------------------");
		System.out.println("예금");
		System.out.println("------------------");

		System.out.print("계좌번호 > ");
		String ano = scanner.nextLine();
		System.out.print("입금액 > ");
		int amount = Integer.parseInt(scanner.nextLine());
		Ex06_Account account = findAccount(ano); // 계좌찾기
		if (account == null) {
			System.out.println("!!!!!!!!!!! 계좌번호를 확인하세요.!!!!!!!!!!");
			return;
		}

		account.setBalance(account.getBalance() + amount); // 현재 잔고
		System.out.println("** 입금이 완료되었습니다. ** ");

	}

	// 계좌 찾기
	private static Ex06_Account findAccount(String ano) {
		for (Ex06_Account acc : accountArray) {
			if (acc == null)
				return null;
			if (ano.equals(acc.getAno()))
				return acc; ///
		}
		return null;
	}

	// 계좌목록보기
	private static void accountList() {
		System.out.println("------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------");

		for (int i = 0; i < index; i++) {
			System.out.printf("%8s", accountArray[i].getAno());
			System.out.printf("%8s", accountArray[i].getOwner());
			System.out.printf("%,12d%n", accountArray[i].getBalance()); // ,1000단위 기호 표시
		}

	}

	// 계좌생성

	private static void createAccount() {
		System.out.println("------------------");
		System.out.println("계좌 생성");
		System.out.println("------------------");

		String ano = (1001 + index) + " ";
		System.out.println("계좌주 이름 >");
		String owner = scanner.nextLine();

		System.out.print("최초 입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());

		accountArray[index++] = new Ex06_Account(ano, owner, balance);
		System.out.println("** 계좌가 생성되었습니다. **");

	}

// 동일한 account 객체 찾기

}
