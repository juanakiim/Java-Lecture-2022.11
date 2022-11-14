package ch11.sec03_obejct;

public class Customer implements Cloneable { // cloneable (복제를위한)

	
	String id;
	String name;
	int age;
	boolean adult;
	
	public Customer(String id, String name, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}
	
	Customer getCustomer() {
		 Customer cloned = null;
		 try {
			cloned = (Customer) clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		 return cloned;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}
	
	
}
