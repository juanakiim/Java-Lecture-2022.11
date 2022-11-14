package ch08;

public class Ex11_SoundableExample {

	private static void printSound(Ex11_Soundable soundable) {
		System.out.println(soundable.sound());
	}

	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());
	}

}

class Cat implements Ex11_Soundable {

	@Override
	public String sound() {

		return "야옹";
	}

}

class Dog implements Ex11_Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}

}
