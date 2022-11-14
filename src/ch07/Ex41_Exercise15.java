package ch07;

import java.util.Scanner;

public class Ex41_Exercise15 {

	public static void main(String[] args) {

		MemberService memberService = new MemberService();

		// 등록
		memberService.register("hong", "12345", "홍길동");
		memberService.printAllMembers();
		memberService.register("kim", "56789", "김자바");
		memberService.printAllMembers();
		memberService.register("kim", "56789", "홍자바");
		memberService.printAllMembers();
		System.out.println();

		// 아이디값 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(ID) : ");
		String id = scan.nextLine();

		// 패스워드값 입력
		System.out.print("패스워드(PW) : ");
		String password = scan.nextLine();

		boolean result = memberService.login(id, password);
		if (result) {
			System.out.println("로그인되었습니다.");
			memberService.logout(id);
		} else {
			System.out.println("ID 또는 PW가 올바르지 않습니다.");
		}

	}

}
