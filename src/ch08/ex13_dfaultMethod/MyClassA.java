package ch08.ex13_dfaultMethod;
/**
 * 기존에 myInterface를 구현한 클래스 
 * @author juana
 *
 */

public class MyClassA implements MyInterface{

	@Override
	public void method1() {
		
		System.out.println("MyClassA - method1()");
	}

}
