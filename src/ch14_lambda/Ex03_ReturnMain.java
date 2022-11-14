package ch14_lambda;
/**
 * with arguments, with return value
 * @author juana
 *
 */
public class Ex03_ReturnMain {

	public static void main(String[] args) {
		
		Ex03_MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
	System.out.println(fi.method(3, 4));
		
	fi = (x,y ) -> {return x + y;}; //return 있을땐 중괄호 못뻄
	System.out.println(fi.method(3, 4));
	
	
	fi = (x,y) -> x + y; // return을 붙이면 에러 
	System.out.println(fi.method(3, 4));

	fi = (x,y) -> sum(x,y);
	System.out.println(fi.method(3, 4));

	}
	
	static int sum(int a, int b ) {
		return a + b; 
	}

}
