package ch09;

/*
 * 중첩클래스
 */
public class A { // 외부클래스
	A() {
		System.out.println("A객체가 생성됨");
	}

	/*
	 * 인스턴스멤버 클래스
	 */

	class B {
		B() {System.out.println("B객체가 생성됨");}

		int field1;
		void method1() {}
	}

	/*
	 * static 멤버로 클래스(정적멤버)
	 */

	static class C {
		C() {System.out.println("C객체가 생성됨");}

		int field1;
		static int field2;

		void method1() {		}

		static void method2() {}	}

	void method() {
		/* 로컬 클래스 */
		class D {
			D() { System.out.println("D 객체가 생성됨."); }
			int field1;
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();

}
}
