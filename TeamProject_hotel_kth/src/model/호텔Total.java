package model;

import java.util.Scanner;

import controller.호텔예약;


public class 호텔Total implements 호텔예약 {
	
	

	@Override
	public void 예약등록() {
		 System.out.println("예약 등록합니다. ");
		
	}
	@Override
	public void 예약취소() {
		System.out.println("예약 취소합니다. ");
		
	}
	@Override
	public void 본인예약조회() {
		System.out.println("예약 현황입니다. ");
		
	}
	@Override
	public void 전체예약현황() {
		System.out.println("전체예약 현황입니다. ");
		
	}
	@Override
	public void 파일처리() {
		System.out.println(" 파일처리 ");
		
	}
	
}
