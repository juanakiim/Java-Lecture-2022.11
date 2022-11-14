package ch11.sec04_objects;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return Integer.compare(o1.sno, o2.sno);
		
		
		
		// comparator<t> --->t 는 어떤객체의 타입이 들어온다고 보면됨 
	}

}
