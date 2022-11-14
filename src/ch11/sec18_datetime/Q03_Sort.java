package ch11.sec18_datetime;

public class Q03_Sort {
	public static void main(String[] args) {
		
		int[] a = {32,38,79,75,47,56};
		for(int i = 0; i<a.length - 1; i++) {
			for(int k = i+1; k<a.length; k++) {
				if(a[i] > a[k]) {
					// 오름차순 
					int tmp = a[i];
					a[i] = a[k];
					a[k] = tmp; 
				}
			}
		}
	}

}
