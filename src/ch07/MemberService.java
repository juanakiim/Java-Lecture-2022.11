package ch07;

import javax.imageio.spi.RegisterableService;

public class MemberService {

	// 여기에다가 데이터를 집어넣고 login logout 해보자
	private Member[] members = new Member[10];

	void register(String id, String password, String name) {

		// 멤버변수 생성
		Member member = findById(id);

		if (member != null) {// id 중복이라는말
			System.out.println("중복된 아이디 입니다.");
			return;
		}
		member = new Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {
				members[i] = member;
				break;
			}
		}

	}

// =============================================================================	
	void printAllMembers() { // members의 데이터 출력
		for (Member member : members) {
			if (member == null)
				break;
			System.out.println(member);
		}

	}

// =============================================================================

	Member findById(String id) { // id배열에서 hong이있는지 없는지 확인필요
		for (Member member : members) {
			if (member == null) // member가 null이라는것은 id에 해당하는 멤버를 못찾고 끝까지 간경우
				break;
			if (id.equals(member.getId())) // member의 id를 찾은경우 return member
				return member;
		}
		return null;
	}
// =============================================================================

	boolean login(String id, String password) {
		Member member = findById(id);
		if (member == null) // id에 해당하는 member가 없는 경우
			return false;
		else {
			// id에 해당하는 멤버를 찾은경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다.");
				return true;
			} else
				return false; // 패스워드가 틀린경우
		}
	}

// =============================================================================
	void logout(String id) {
		Member member = findById(id);
		System.out.println(member.getName() + "님 로그아웃되셨습니다.");
	}

}
