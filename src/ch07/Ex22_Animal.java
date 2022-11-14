package ch07;

public  abstract class Ex22_Animal {
	String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound(); // abstract로 하면 sound가 추상메소드
	/*
	 * 추상메소드로 되어있다는 것은 
	 */
}

class Cow extends Ex22_Animal {
	//생성자
	Cow( ) {
		this.kind = "소";
		
	}

	@Override
	public void sound() {
		System.out.println("음메~ ~ ~");
	}
	
	
class Cock extends Ex22_Animal {
	Cock( ) {
		this.kind = "닭";
	}
	
	@Override
	public void sound() {
		System.out.println("꼬끼오~");
	}
}
}
