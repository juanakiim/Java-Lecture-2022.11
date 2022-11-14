package ch07;
/**
 * 추상 CLS (abstract)
 * @author juana
 *
 */
public abstract class Ex21_Phone {
	
	// field 정의 
	public String owner;
	
	//생성자
	Ex21_Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드 
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}


// abstract 클래스를 상속받은 것 
class SmartPhone extends Ex21_Phone {

	SmartPhone(String owner) {
		super(owner);
	}
	
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	
}
