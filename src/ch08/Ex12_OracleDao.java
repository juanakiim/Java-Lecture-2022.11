package ch08;

/**
 * oracle data access object
 * @author juana
 *
 */
public class Ex12_OracleDao implements Ex12_DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}

}
