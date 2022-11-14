package ch14_lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex08_AndOrlegate {

	public static void main(String[] args) {
		
		//2의 배수 검사(a를 받아서 a를 2로나눈 몫이 0인지)
		IntPredicate pA = a -> a %2 ==0;
		
		//3의 배수 검사 
		IntPredicate pB = a -> a % 3 == 0;

		
		//AND()
		IntPredicate pAB = pA.and(pB); //2의 배수이면서 3의배수 = 2와 3의 공배수 
		System.out.println(pAB.test(6));
		System.out.println(pAB.test(9));
		
		
		//OR()
		pAB = pA.or(pB); //2의 배수이거나 3의배수 
		System.out.println(pAB.test(5));
		System.out.println(pAB.test(15));
		
		// negate() : not 
		pAB = pA.negate();
		System.out.println(pAB.test(6));
		System.out.println(pAB.test(9));
		
		
	}

}
