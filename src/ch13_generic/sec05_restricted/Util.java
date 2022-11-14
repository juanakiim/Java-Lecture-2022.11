package ch13_generic.sec05_restricted;

public class Util {

	public static <T extends Number> int compare(T t1, T t2) { //number의 자식(하위)객체이면됨 

		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();

		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());

		return Double.compare(v1, v2); // compare는 int타입이므로 어떤것이 더크다는것 비교가능

	}

}
