package ch07;

public class Ex13_Main {

	public static void main(String[] args) {
		
		Ex13_Driver driver = new Ex13_Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi); 
		
		//매개변수에도 다형성이 달릴 수 있음 

	}

}
