package ch13_generic.sec07_Inheritance;

import ch13_generic.sec04_method.Util;

public class Q03_UtilExample {

	public static void main(String[] args) {
		Q04_Pair<String, Integer> pair = new Q04_Pair<String, Integer>("홍길동", 35);
		Integer age = Q04_Util.getValue(pair, "홍길동");
		System.out.println(age);

	
		Q04_ChildPair<String, Integer> childPair = new Q04_ChildPair<String, Integer>("홍삼원",20);
		Integer ChildAge = Q04_Util.getValue(childPair,"홍삼순");
		System.out.println(ChildAge);
		
		
	}

}
