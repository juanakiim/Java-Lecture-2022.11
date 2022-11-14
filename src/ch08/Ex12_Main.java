package ch08;

public class Ex12_Main {

	public static void main(String[] args) {
		dbWork(new Ex12_OracleDao()); //oracle 다오에 객체를만든다음 출력
		dbWork(new Ex12_MySqlDao());

	}

	private static void dbWork(Ex12_DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
