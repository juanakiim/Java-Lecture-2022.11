package ch11.sec03_obejct;

public class Key {

	public int number;

	public Key(int number) {
		super();
		this.number = number;
	}

	@Override
	public int hashCode() {
		return number; // Objects.hashcode(number) 나중엔 이렇게 쓰기
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Key) {
			Key compareKey = (Key) obj; // 강제타입변환
			if (number == compareKey.number)
				return true;
		}
		return false;
	}
}
