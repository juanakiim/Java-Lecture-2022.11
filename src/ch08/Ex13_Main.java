package ch08;

public class Ex13_Main {

	public static void main(String[] args) {

		Ex13_Action action = new Ex13_Action() {

			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
//실제사용안됨
	}

}
