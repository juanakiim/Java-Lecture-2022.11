package ch15_Collection.sec05_properties;

import java.io.IOException;
import java.util.Properties;

public class Ex01_Properties {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		//database.
		prop.load(Ex01_Properties.class.getResourceAsStream("database.properties"));
		
		String driver = prop.getProperty("driver");
		System.out.println(driver);
	}

}
