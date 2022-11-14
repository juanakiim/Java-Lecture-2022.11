package ch14_lambda;

@FunctionalInterface
public interface Ex01_MyfunctionalInterface {
	
	//메소드정의 
	public abstract void method(); //--> 추상메소드 
	// void otherMethod(); ---> 추상메소드가 두개 이상이면 오류발생 
	
}
