package Day06;

public class Account_ex2 {

	// 1. 필드
		private String ano;
		private String owner;
		private int balance;

	// 2. 생성자
		public Account_ex2(String ano, String owner, int balance) {
			this.ano = ano;
			this.owner = owner;
			this.balance = balance;
		}
		
	// 3. 메서드 

		public String getAno() {
			return ano;
		}

		public void setAno(String ano) {
			this.ano = ano;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public int getBalance() {
			return balance;
		}

		public void setBalance(int balance) {
			this.balance = balance;
		}
		
}
