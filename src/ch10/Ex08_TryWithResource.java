package ch10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex08_TryWithResource {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("Ex06_MultiCatch.java");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
