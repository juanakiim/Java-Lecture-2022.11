package ch13_generic.sec07_Inheritance;
/*
 * p.587 확인문제 3번 
 */
public class Q02_ContainerExample {

	public static void main(String[] args) {
		
		Q02_Container<String, String> container1 = new Q02_Container<String,String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + ":" + job);
		
		Q02_Container<String, Integer> container2 = new Q02_Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + ": " + age);

		
	}

}
