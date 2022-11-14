package ch04;

/**
 * Switch문
 * 
 * @author juana
 *
 */

public class Ex04_Switch {

	public static void main(String[] args) {

		int score = 75;
		String grade;

		switch (score / 10) {
		case 10:
		case 9: //case 값이 10과 9일경우 grade = A 
			grade = "A";
			break; /// switch 블록을 탈출
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default: // 위에서 조건이 맞지 않는 경우 default로 옴
			grade = "F";

		}

		System.out.println(score + "점은 " + grade + " 입니다.");
	}

}
