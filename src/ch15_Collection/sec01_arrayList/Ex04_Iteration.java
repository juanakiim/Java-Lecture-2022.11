package ch15_Collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List에 사용할 수 있는 반복문 
 * @author juana
 *
 */
public class Ex04_Iteration {

	public static void main(String[] args) {
		
	List<Board> list = new ArrayList<>();
		for(int i =1; i <=5; i++)
			list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		
		// 전통적인 for문 
		for(int i=0; i<list.size();i++) 
			System.out.println(list.get(i)); //list에 get해서 i번째 값을 가져오면됨 
		System.out.println();
		
		// Enhanced-for loop
		for(Board b : list)
			System.out.println(b);
		System.out.println();
		
		// Iteration 객체 사용  - java 고전적 방법
		Iterator<Board> iter = list.iterator();
		while(iter.hasNext()) {
			Board b = iter.next(); // 받아오기 
			System.out.println(b);
		}
		//forEach - lambda식 활용 
			list.forEach(b -> System.out.println(b)); //--> board 라고 하는 객체 하나씩이 튀어나옴 
			list.forEach(b -> System.out.println(b.getSubject()));
		}
	}


