package ch07;

public class Ex02_Child extends Ex02_Parent {
	
	int childInt;
	
	void childMethod() {
		super.parentMethod(); // 부모의 메소드도 한번 부름
		System.out.println("Child : " + childInt);
	}

	
	@Override
	void parentMethod() { //child에서 부모의 parentMethod 새롭게 재정의 
		System.out.println("Child : " + parentInt);
	}
}
