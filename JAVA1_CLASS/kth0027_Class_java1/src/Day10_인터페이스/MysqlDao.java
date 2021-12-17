package Day10_인터페이스;

public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println( " mysql DB에서 검색 ");
		// TODO Auto-generated method stub

	}

	@Override
	public void insert() {
		System.out.println( " mysql DB에서 삽입 ");
		// TODO Auto-generated method stub

	}

	@Override
	
	public void update() {
		System.out.println( " mysql DB에서 수정 ");
		// TODO Auto-generated method stub

	}
	@Override
	public void delete() {
		System.out.println( " mysql DB에서 삭제 ");
		// TODO Auto-generated method stub

	}

}
