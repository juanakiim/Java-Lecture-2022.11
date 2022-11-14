package ch13_generic.sec07_Inheritance;

public class Q04_Pair<K,V> {
	
	private K key;
	private V value;
	

	public Q04_Pair(K key, V value) {
	
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}

	
	
 }
