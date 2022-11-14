package ch08.ex13_dfaultMethod;


/**
 * 새롭게 Myinterface를 구현한클래스
 * @author juana
 *
 */
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB - method2()");
		
	}

}
