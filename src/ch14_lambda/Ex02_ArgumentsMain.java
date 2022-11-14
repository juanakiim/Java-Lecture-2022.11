package ch14_lambda;

public class Ex02_ArgumentsMain {

	public static void main(String[] args) {

		Ex02_MyFunctionalInterface fi;

		fi = (x) -> {
			int result = x * x;
			System.out.println(result);
		};

		fi.method(3);

		
		fi = x -> { System.out.println(x * x );
			// 아규먼트가 하나만 있을때 () 생략가ㅡㄴㅇ 
		};
		
		fi.method(4);
		
		fi = x -> System.out.println(x*x);
		fi.method(5);
		
	}

}
