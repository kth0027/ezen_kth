package 항공권_참고;

public interface 예매 {
	   
	   public void 예매등록();
	   public void 예매취소();
	   public void 입금();
	   public void 예매조회();
	   public void 자리조회();
	   
	   default void 실행() {System.out.println("예매 시작 합니다. ");}
	}
