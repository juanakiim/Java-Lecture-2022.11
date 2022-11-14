package ch07;

public class Ex14_Parent {

	String  name = "부모";
	
	void parent() {
		System.out.println("Parent : " + name);
	}

	void parentMethod() {
		// TODO Auto-generated method stub
		
	}
}

class Son extends Ex14_Parent {
	String sonName = "아들";
	
	void sonMethod() {
		System.out.println("Son :  " + sonName);
	}
	
	@Override
	void parentMethod() {
		System.out.println("son" + name );
	}
}

class Daughter extends Ex14_Parent {
	String daughterName = "딸";
	void daughterMethod () {
		System.out.println( "Daughter : " + daughterName);
	}
	
	@Override
	void parentMethod () {
		System.out.println("daughter : " + name);
	}
}
