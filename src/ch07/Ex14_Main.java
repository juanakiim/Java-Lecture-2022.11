package ch07;

/**
 * 강제타입변환 (casting)
 * 
 * @author juana
 *
 */
public class Ex14_Main {

	public static void main(String[] args) {

		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();
		
		parent = son;  // 자동타입변환
		parent.parentMethod();
		
		parent = daughter;
		parent.parentMethod();
		
		
		/*
		 * 강제타입변환 (올바른예시가아닌경우)
		 * 
		 */
		
//		daughter = (Daughter)parent;  // 강제타입변환 casting  
//		daughter.daughterMethod(); // parent메소드까지도 사용가능함 
//		
//		son = (Son)parent;
//		son.sonMethod(); // classcast exception 오류발생 (casting잘못함)
		
		/*
		 * 강제타입변환 (올바른예시)
		 * 1) instance of 
		 */
		
		if(parent instanceof Daughter) { //true
			daughter = (Daughter)parent;
			daughter.daughterMethod();
		}
		if(parent instanceof Son) { //false 
			son = (Son)parent;
			son.sonMethod();
		}
	}

}
