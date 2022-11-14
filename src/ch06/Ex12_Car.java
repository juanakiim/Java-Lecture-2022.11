package ch06;

public class Ex12_Car { // 붕어빵을 찍는 기계다!!

	String company;
	String model;
	String color;
	int maxSpeed;

//	public Ex12_Car() { } // 기본생성자, 생략하면 컴파일러가 만들어줌.

	void printField() {
		System.out.println(this.company + "," + this.model + "," + this.color + "," + this.maxSpeed);
	}

	@Override // source - generate tostring()
	public String toString() {
		return "Ex12_Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}

}
