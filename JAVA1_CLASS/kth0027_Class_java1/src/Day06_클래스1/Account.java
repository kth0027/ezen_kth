package Day06_클래스1;

public class Account {
	
	// 1. 필드 생성 [ private : 필드 보호를 위한 접근 제한자 ]
		// 현재 클래스 내에서만 사용가능
		// 외부로 접근 불가 [ 간접접근 : get, set 메소드 ]
	private String ano;
	private String owner;
	private int balance;
	
	
	
	
	// 2. 생성자
		// 자동완성 : 
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	
	
	// 3. 메소드 // 자동완성
	public String getAno() {return ano;}

	public void setAno(String ano) {this.ano = ano;}

	public String getOwner() {return owner;}

	public void setOwner(String owner) {this.owner = owner;}

	public int getBalance() {return balance;}

	public void setBalance(int balance) {this.balance = balance;}
	
	
	
	
	
	

//	public String getAno() { return ano; }
//	public void setAno(String ano) { this.ano = ano; }
//	public String getOwner() { return owner; }
//	public void setOwner(String owner) { this.owner = owner; }
//	public int getBalance() { return balance; }
//	public void setBalance(int balance) { this.balance = balance; }

}
