package ch11.sec18_datetime;

import ch08.ex13_dfaultMethod.Main;

public class Q04_TV {
	
	public static void main(String[] args) {
		
		
	Q04_ColorTv mytv = new Q04_ColorTv(32,1024);
		
	}
	
	class TV {
	
	private int size;
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() { return size;}
}

}
