package ch06;

public class Ex12_Main {

	public static void main(String[] args) {
		Ex12_Car car = new Ex12_Car(); // 객체 생성 = 붕어빵!

		car.company = "현대자동차";
		car.color = "은색";
		car.model = "Ionic6";
		car.maxSpeed = 200;

		System.out.println(car.company + "," + car.model + "," + car.color + "," + car.maxSpeed);
		System.out.println(car);

		Ex12_Car bus = new Ex12_Car(); // 객체 생성
		bus.company = "기아자동차";
		bus.model = "리무진";
		bus.color = "pink";
		bus.maxSpeed = 180;

		bus.printField(); /// 프린트됨
		System.out.println(bus.toString()); // 클래스에 있는 filed 값들을 얼마든지 출력가능함

		Ex12_Car taxi = new Ex12_Car();
		taxi.model = "소나타";
		taxi.color = "흰색";
		taxi.maxSpeed = 180;
		System.out.println(taxi);

	}

}
