package ch15_Collection.sec04_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02_BoardHashMap {

	public static void main(String[] args) {
		
		Map<Integer, Board> map = new HashMap<>();
		
		for(int i = 1; i<=5; i++) 
			map.put(i, new Board("제목"+i,"내용"+i,"글쓴이" + i));
	//	map.forEach((k,v)-> System.out.println(k +":" + v));
		
		Set<Integer> keySet = map.keySet();
		for(int key : map.keySet())
			System.out.println(key + ": " + map.get(key));
	}

}
