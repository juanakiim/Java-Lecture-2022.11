package ch03;

/** 
 * 단항연산자 
 * @author juana
 *
 */

public class EX02_Unary {

	public static void main(String[] args) {
		
		boolean a = true;
		System.out.println(!a);  //logical not 
		
		int b = 3;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(-b));
		System.out.println(Integer.toBinaryString(~b)); //bitwise 반전 
		System.out.println(Integer.toHexString(-b));
		

	}

	
	
	
	
}
