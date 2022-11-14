package ch13_generic.sec07_Inheritance;

public class Main {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("UHD-TV");
		product.setCompany("Multicampus");
		
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0); //0번째 인덱스에다가 add
		Tv tv = storage.get(0);
		
	}
}
