
public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 30;
		short c = 300;
		int i = b; // 작은수 -> 큰수로 가는 것은 자동변환이 이루어짐 = promotion 	
		i = c ;  // promotion 
		 
	/* ( 에러예시 )	short s = i;  */ 
		short s =  (short)i;  // 큰수에서 작은수로 변할때는 강제로 명시적변환이 필요함 // 
		
		long l = i; //int를 long에 집어넣는것 가능
		float f = l;  // long을 float으로 변환 가능 
		double d = f; // float는 double로 변환 가능 
		
		byte bb = (byte)s;
		System.out.println(s);
		System.out.println(bb);
		
		
		i  = b + s;
		d = f + l;
		String str = "str" + d;
		// byte -> short -> int -> long -> float -> double -> String 
		
	}

}
