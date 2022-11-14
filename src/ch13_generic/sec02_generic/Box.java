package ch13_generic.sec02_generic;

/**
 * generic으로 box를 만든것 
 * @author juana
 *
 * @param <T>
 */

public class Box<T> {

	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
		
	}
	
	
}
