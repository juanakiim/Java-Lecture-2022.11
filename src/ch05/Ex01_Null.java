package ch05;

public class Ex01_Null {

	public static void main(String[] args) {
		
		// null은 참조형 변수에만 사용이가능 // 
		String s = null;
		int[] intArray = null;
		
		// int a = null; 기본타입에는 사용할 수 없음(error발생) 
		
	System.out.println(s.length());   // ---> NullPointerException 발생 
		
//		intArray[0] = 5; //---> NullPointerException 발생 
		
		
		String s0 = "";
		System.out.println(s0.length());
		
		
		
		}
		
	}

