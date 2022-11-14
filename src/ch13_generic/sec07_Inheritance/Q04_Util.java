package ch13_generic.sec07_Inheritance;

public class Q04_Util {

	public static <K, V> V getValue(Q04_Pair<K, V> p, K k) {
		if (p.getKey().equals(k)) {
			return p.getValue();
		} else {
			return null;
		}
	}

}
