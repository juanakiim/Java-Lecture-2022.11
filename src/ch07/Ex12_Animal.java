package ch07;

/**
 * 다형성 - animal사례
 * 
 * @author juana
 *
 */

public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;

		// animal과 cat이 같은걸로 불러씀
		Animal animal = cat; // polymorphsim
		animal.animalMethod();
		
		Animal animal2 = new Dog();
		animal2.animalMethod();
		

		// animal.catMethod(); // 오류발생 , animal에서는 animal 클래스안의 메소드만 사용가능함
		cat.catMethod();

	}

}

class Animal { // 부모 class

	// animal field
	int animalField;
	String sound;
	

	void animalMethod() {
		System.out.println("Animal : " + animalField);
		System.out.println("동물이 소리를 냅니다.");
	}

}

class Cat extends Animal {
	int catField;

	void catMethod() {
		System.out.println("Cat : " + catField);
		
	}

	@Override
	void animalMethod() {
		System.out.println("Cat : " + animalField);
		System.out.println("야옹~~~~");

	}

}


class Dog extends Animal {
	int dogField;

	void dogMethod() {
		System.out.println("Dog : " + dogField);
	}

	@Override
	void animalMethod() {
		System.out.println("Dog : " + animalField);
		System.out.println("멍!멍!!!!!");

	}

}
