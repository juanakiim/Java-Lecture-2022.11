package ch07;

public class Ex04_Student extends Ex04_Person {

	String major;

	public Ex04_Student(String name, String gender, int age, String major) {
		super(name, gender, age); // 부모생성자에 있는 생성자 내부꺼를 가져옴
		this.major = major;
	}

	void study() {
		System.out.println("공부합니다.");
	}

	@Override // inheritage field 까지포함
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}

}
