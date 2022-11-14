package ch13_generic.sec07_Inheritance;

public class Q02_Container<K, V> {

	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
