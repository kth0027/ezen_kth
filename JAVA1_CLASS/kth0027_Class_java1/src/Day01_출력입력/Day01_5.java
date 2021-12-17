package Day01_출력입력;

import java.util.Scanner;

public class Day01_5 {
	public static void main(String[] args) {
		// 1. 입력객체 만들기 
		Scanner 입력객체 = new Scanner(System.in);
		
		// 2. 입력받은 값을 변수/객체(메모리) 저장[ 옮기기 ] 
		System.out.println("회원가입 아이디 : "); String 아이디 = 입력객체.next();
		System.out.println("회원가입 비밀번호 : "); String 비밀번호 = 입력객체.next();
		System.out.println("회원가입 성명 : "); String 성명 = 입력객체.next();
		System.out.println("회원가입 이메일 : "); String 이메일 = 입력객체.next();
		
		// 출력
		System.out.println("<<<<<< 회원가입 완료 위해 아래 정보를 확인해주세요 >>>>>>");
		System.out.println("\t아이디\t비밀번호\t성명\t이메일");
		System.out.println("\t" + 아이디 + "\t" + 비밀번호 + "\t" + 성명 + "\t" + 이메일);
		
	}
}