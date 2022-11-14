package ch07;

public class Ex01_Main {

	public static void main(String[] args) { // 기본상속

		Ex01_Parent parent = new Ex01_Parent();
		Ex01_Child child = new Ex01_Child();

		parent.parentInt = 5;
		parent.parentMethod();

		child.childInt = 10;
		child.childMethod();

		child.parentInt = 30;
		child.parentMethod(); // child가 부모의 메소드를 사용할수 있음
		
		Ex01_Child child2 = new Ex01_Child(200); 
		child2.parentMethod();
		
		// this. -- > 나자신의 생성자 , super() ---> 부모생성자 
		// 오버로딩, 오버라이딩 다름 

	}

}
