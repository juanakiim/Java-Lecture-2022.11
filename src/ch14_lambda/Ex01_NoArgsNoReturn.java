package ch14_lambda;

/**
 * No arguments, No return value 
 * @author juana
 *
 */

public class Ex01_NoArgsNoReturn {

	public static void main(String[] args) {
		
		//변수선언 
		Ex01_MyfunctionalInterface fi;
		
		fi = () -> {
			String str = "method call";
			System.out.println(str);
		}; 
		fi.method();
		
		fi = () -> {System.out.println("method call");};
		fi.method();

		fi = () -> System.out.println("method call");
		fi.method();
	
	
	}
}
