package ch15_Collection.sec06_treeSet;

import java.util.TreeSet;

public class Ex01_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
	
		int[] arr = {87,98,75,95,80};
		for(int score : arr)
			scores.add(score);
		
		for(int score : scores)
			System.out.println(score);
		System.out.println();
		
		
		// 특정 객체 가져오기 
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위에 점수 : " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling(85));
		
		
	}

}
