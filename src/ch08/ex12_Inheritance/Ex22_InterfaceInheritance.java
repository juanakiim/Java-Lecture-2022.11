package ch08.ex12_Inheritance;

public class Ex22_InterfaceInheritance {

	public static void main(String[] args) {
		
		Ex22_InterfaceC ic = new ImplementClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		ic = misc;//다형성
		ic.methodA();
		ic.methodB();
		ic.methodC();
		//ic.methodParent(); 인터페이스가 가지고있는게아님

	}

}
