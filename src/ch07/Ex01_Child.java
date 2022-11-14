package ch07;

public class Ex01_Child extends Ex01_Parent { // 상속을 위한 extends 사용

	int childInt;
	
	
	public Ex01_Child() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Ex01_Child(int childInt) {
		super(childInt *2);
		this.childInt = childInt;
	}




	void childMethod() {

		System.out.println(childInt);
	}

}
