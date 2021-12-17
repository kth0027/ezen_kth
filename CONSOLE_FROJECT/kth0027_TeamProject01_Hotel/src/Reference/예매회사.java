package Reference;

public class 예매회사 implements 예매 {
	   
	   @Override
	   public void 예매등록() {
	      System.out.println("예매합니다. ");
	      
	   }
	   @Override
	   public void 예매취소() {
	      System.out.println("예매취소합니다. ");
	      
	   }
	   @Override
	   public void 입금() {
	      System.out.println("입금되었습니다. ");
	      
	   }
	   @Override
	   public void 예매조회() {
	      System.out.println("전체예매현황입니다. ");
	      
	   }
	   @Override
	   public void 자리조회() {
	      System.out.println("~~님이 예약하신 좌석 현황입니다. ");
	      
	   }

	   
	}
