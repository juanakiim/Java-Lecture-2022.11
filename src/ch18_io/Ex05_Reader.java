package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex05_Reader {

	public static void main(String[] args) throws IOException {
		
		Reader reader = null;
		
		//1 문자씩 읽기
		
		reader = new FileReader("/temp/test.txt");
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.println(data);
		}
		
		reader.close();
		System.out.println();
		

	}

}
