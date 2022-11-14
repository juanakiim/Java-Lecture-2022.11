package ch07;

public class Ex05_AccountMain {

	public static void main(String[] args) {
		
		Ex05_Account account = new Ex05_Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고는 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고는 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고는 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고는 : " + account.getBalance());
		
	}

}
