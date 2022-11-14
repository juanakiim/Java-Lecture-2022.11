package ch11.sec03_obejct;

public class Member {

	String id;
	String name;

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 타입이 같은지 확인 (member 클래스에 속하는지)

		if (obj instanceof Member) {
			// * instance of *
			Member member = (Member) obj; 
		//	if(id.equals(member.id) && name.equals(member.name)) //id, name이 모두 같아야 true 
		   if(id.equals(member.id))  //id만동일한 경우 
			{
				
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
}
