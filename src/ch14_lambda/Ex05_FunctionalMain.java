package ch14_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05_FunctionalMain {

	public static void main(String[] args) {
		// consumer 는 입력값은 있고 return 값이 없는것
		Consumer<Integer> c = i -> System.out.println(i*i);
		
		// supplier는 입력값은 없고 return 값은 있음 
		Supplier<Integer> s = () -> (int)(Math.random() * 6 ) + 1;
		
		// function은 입력값,결과값 다있음
		Function<Integer, Integer> f = i -> i * i;
		
		//predicate는 입력이 주어지고  Return값은 boolean return (맞는지,틀린지)
		Predicate<Integer> p = x -> x % 2 == 1; 

		
		c.accept(5);
		System.out.println(s.get());
		System.out.println(f.apply(5));
		System.out.println(p.test(3));
		
	}

}
