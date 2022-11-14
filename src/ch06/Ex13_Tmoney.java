package ch06;

/**
 * Tmoney Card
 * 
 * 1) 만원카드 구매 2) 1회 요금 1350원씩 차감 3) 금액이 -가 되면 안됨(잔액이 1000원이라고하면 사용못함) 4) 금액을
 * 재충전해야함
 * 
 * @author juana
 *
 */
public class Ex13_Tmoney {

	public static void main(String[] args) {
		Tmoney card = new Tmoney(10000); // 1만원짜리 카드구입
		while (true) {

			if (!card.ride()) // 메소드
				break;
			System.out.println(card.cash);
		}
		card.charge(10000);
		while (true) {

			if (!card.ride()) // 메소드
				break;
			System.out.println(card.cash);
		}
	}

}

class Tmoney {

	int cash;

	Tmoney() {
		this.cash = 10000;
	}

	Tmoney(int cash) {
		this.cash = cash;//
	}

	boolean ride() {
		if (this.cash >= 1350) {
			this.cash -= 1350; // 현재금액에서 1350원만큼 차감
			return true;
		}
		return false;
	}
	
	void charge(int cash) {
		this.cash += cash;
	}
}