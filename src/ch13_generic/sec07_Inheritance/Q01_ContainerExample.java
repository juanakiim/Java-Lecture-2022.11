package ch13_generic.sec07_Inheritance;

public class Q01_ContainerExample {
	public static void main(String[] args) {
		
		Q01_Container<String> container1 = new Q01_Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Q01_Container<Integer> container2 = new Q01_Container<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}

}