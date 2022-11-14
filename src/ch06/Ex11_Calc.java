package ch06;

public class Ex11_Calc {

	public static void main(String[] args) {
		// 만든 클래스 사용
		
		Calc calc = new Calc(1.2, 3.4);
		double res = calc.add(); 
		System.out.println(res);
		
		System.out.println(new Calc(2.5, 4.6).add());
		System.out.println(new Calc(2.5, 4.6).sub());
		System.out.println(new Calc(2.5, 4.6).mul());
		System.out.println(new Calc(2.5, 4.6).div());
	}	

}




// 내가 만든 클래스 
class Calc { // default 생략되어있음 
	
	double x;     //field(속성값을 갖는 멤버변수)
	double y;
	
	Calc(double x, double y) { // 생성자
		this.x = x;
		this.y = y;
		
	}
	
	double add( ) {     //method (멤버변수 사용가능)
		return this.x + this.y;
	}
	
	double sub() {
		return this.x - this.y;
	}
	
	double mul() {
		return this.x * this.y;
	}
	
	double div() {
		return this.x / this.y;
	}
	
}