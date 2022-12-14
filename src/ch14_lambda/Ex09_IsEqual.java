package ch14_lambda;

import java.util.function.Predicate;

public class Ex09_IsEqual {

	public static void main(String[] args) {
		
		Predicate<String> predicate;
		
		predicate = Predicate.isEqual(null);
		System.out.println("null , null : " + predicate.test(null));
		
		predicate = Predicate.isEqual("java");
		System.out.println("null , java : " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("java , null : " + predicate.test("java"));
		
		predicate = Predicate.isEqual("java");
		System.out.println("java , java : " + predicate.test("java"));
		
		predicate = Predicate.isEqual("java11");
		System.out.println("java8 , java11 : " + predicate.test("java8"));

	}

}
