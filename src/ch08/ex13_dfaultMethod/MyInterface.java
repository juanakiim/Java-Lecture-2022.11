package ch08.ex13_dfaultMethod;

public interface MyInterface {
	abstract void method1();
	public default void method2() {
		System.out.println("MyInterface - method2()");
	}
	
}
