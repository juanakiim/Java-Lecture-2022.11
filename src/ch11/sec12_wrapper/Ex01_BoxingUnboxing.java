package ch11.sec12_wrapper;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		
		
		/*
		 * Boxing 
		 */
		Integer obj1 = Integer.valueOf(100); // --> 이방법이 더 많이 사용됨 
		Integer obj2 = new Integer("200"); //deprecated 
		Integer obj3 = 300; // 자동박싱
		
		
		/*
		 * Unboxing 
		 */
		
		int value1 = obj1.intValue();
		int value2 = obj2.intValue(); // 자동 언박싱
		int value3 = obj3;
		
		System.out.println(value1 + "," + value2 + "," + value3);
		System.out.println(obj1.toString());
		
		
	}

}
