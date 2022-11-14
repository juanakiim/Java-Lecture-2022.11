package ch07;

public class Ex02_Main {

	public static void main(String[] args) {
		
		Ex02_Parent parent = new Ex02_Parent();
		parent.parentInt = 10;
		parent.parentMethod(); //Parent: 10
		
		Ex02_Child child = new Ex02_Child();
		child.childInt = 200;
		child.parentInt = 300;
		child.parentMethod(); //부모에서 정의되어있으나 child가 override 해서 만들어서 Child : 300  
		
		
		child.childMethod(); 
		/* 결과값 // child에서 부모의 메소드도 한번부르고 자기자신값도 찍어서 두개가 나옴 
		 * Parent: 300
           Child : 200
		 */
	}

}
