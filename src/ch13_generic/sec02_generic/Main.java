package ch13_generic.sec02_generic;

public class Main {

	public static void main(String[] args) {

		Box<String> box1 = new Box<String>();
		box1.set("홍길동");
	// box 가 string 타입의 box
		String name = box1.get();

		Box<Apple> box2 = new Box<>(); // 타입생략가능
		box2.set(new Apple());
		Apple apple = box2.get();

	}

}
