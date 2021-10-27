package Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Database.DB;
import Model.Member;
import View.Kiosk;

public class KioskController {
	
	static int kkkkk1 = 0;
	static int idx_1 = 0;
	public static void seatStatus() {
		ArrayList<String> seat = new ArrayList<>();
		AdminController ac = new AdminController();
		MemberController mc = new MemberController();
		Member member = new Member();
		
		DB.downLoad(1);
		DB.downLoad(2);
		int ch2 = 0;
		int ch3;
		
		boolean sw = true;
		
		
		String seatEmpty = "��\t";
		String seatEnough = "��\t";
		
		// �ð� ��� �� �����Ҷ��� int������ �޾Ƽ� ǥ���Ҷ��� string���� ǥ��  
		
		while(true) {
			System.out.println("=============================  PC�� Ű����ũ  ==============================");
			System.out.println("|\t-----------------------  �¼� ��Ȳ  -----------------------\t|");
	
			System.out.print("|\t|\t");
			for(int i = 0; i < 6; i++) {
				System.out.print((i + 1) + "\t");
			}
			System.out.print("|\t|");
			System.out.println();
			System.out.print("|\t|\t");
			for(int i = 0; i < 6; i++) {
				seat.add("��\t");
				System.out.print(seat.get(i));
			}
			System.out.print("|\t|");
			
			System.out.println("\n|\t---------------------------------------------------------\t|");
			System.out.println("|\t| 1. ȸ��\t | 2. �¼����� |\t3. ������ �ڸ��� �̵�  |\t\t|\t|");
			System.out.print("|\t| -----> ");
		
			int ch = Kiosk.sc.nextInt();
			System.out.println("|\t|-------------------------------------------------------|\t|");
			if(ch == 1) {
				System.out.println("|\t| 1. ȸ�� ���� | 2.���̵� ã�� | 3.��й�ȣ ã�� | 4. �ð�����\t|\t|");
				System.out.print("|\t| -----> ");
				int mainCh = Kiosk.sc.nextInt();
				
				if(mainCh == 1) {
					
					System.out.println("|\t-----------------------  ȸ�� ����  -----------------------\t|");
					System.out.print("|\t| ����� ID�� �Է����ּ��� : "); String adminId = Kiosk.sc.next();
					System.out.print("|\t| ����� ��й�ȣ�� �Է����ּ��� : "); String adminPw = Kiosk.sc.next();
					System.out.print("|\t| ����� �̸��� �Է����ּ��� : "); String adminName = Kiosk.sc.next();
					System.out.print("|\t| ����� �̸����� �Է����ּ��� : "); String adminMail = Kiosk.sc.next();
					
					Member guest = new Member(adminId, adminPw, adminName, adminMail, 0, 0);
					
					boolean resultAdmin = MemberController.signup(guest);
					System.out.println("|\t|-------------------------------------------------------|\t|");
					DB.upLoad(1);
				
					if(resultAdmin) {
						for(int i = 0; i < 100; i++) {
							System.out.println();
						}
						System.out.println("[�˸�] ȸ������ ����");
					}else {
						for(int i = 0; i < 100; i++) {
							System.out.println();
						}
						System.err.println("[�˸�] ȸ������ ����");
					}//ȸ������ ����
					//continue;
					
					
				}
				if(mainCh == 2) {
					System.out.println("|\t|----------------------  ���̵�ã��  ----------------------|\t|");
					System.out.print("|\t| �̸� : "); 	String name = Kiosk.sc.next();
					System.out.print("|\t| �̸��� : ");	String email = Kiosk.sc.next();
					mc.forgotId(name, email);
					System.out.println("|\t|-------------------------------------------------------|\t|");
					continue;
				}
				if(mainCh == 3) {
					System.out.println("|\t|---------------------  ��й�ȣã��  ----------------------|\t|");
					System.out.println("|\t| ���̵� : ");	String id2 = Kiosk.sc.next();
					System.out.println("|\t| �̸��� : ");	String email2 = Kiosk.sc.next();
					mc.forgotPd(id2, email2);
					System.out.println("|\t|-------------------------------------------------------|\t|");
					continue;
				}
				if(mainCh == 4) {
					System.out.println("������ ���� �α���");
					System.out.print("ID : ");
					String id = Kiosk.sc.next();
					System.out.print("PW : ");
					String pw = Kiosk.sc.next();
					
					boolean logincheck = MemberController.login(id, pw);
					
					
					
					if(logincheck) {
						
						System.out.println("�ð������� �������ּ��� ");
						System.out.println("1. 1�ð�/1000��\t2. 2�ð�/2000��\t3. 5�ð�/5000��\t4. 10�ð�/10000��");
						
						int timech = Kiosk.sc.nextInt();
						
						if(timech == 1) {
							for(int i =0; i<MemberController.memberlist.size(); i++) {
								if(MemberController.memberlist.get(i).getId().equals(id)) {
									idx_1 = i;
									MemberController.memberlist.get(idx_1).setTime(MemberController.memberlist.get(idx_1).getTime() + 3600);
									MemberController.memberlist.get(idx_1).setMoney(MemberController.memberlist.get(idx_1).getMoney() + 1000);
									ac.total_price += 1000;
									DB.upLoad(1);
									break;
								}
							}
						}
						if(timech == 2) {
							for(int i =0; i<MemberController.memberlist.size(); i++) {
								if(MemberController.memberlist.get(i).getId().equals(id)) {
									idx_1 = i;
									MemberController.memberlist.get(idx_1).setTime(MemberController.memberlist.get(idx_1).getTime() + 7200);
									MemberController.memberlist.get(idx_1).setMoney(MemberController.memberlist.get(idx_1).getMoney() + 2000);
									ac.total_price += 2000;
									DB.upLoad(1);
									break;
								}
							}
						}
						if(timech == 3) {
							for(int i =0; i<MemberController.memberlist.size(); i++) {
								if(MemberController.memberlist.get(i).getId().equals(id)) {
									idx_1 = i;
									MemberController.memberlist.get(idx_1).setTime(MemberController.memberlist.get(idx_1).getTime() + 18000);
									MemberController.memberlist.get(idx_1).setMoney(MemberController.memberlist.get(idx_1).getMoney() + 5000);
									ac.total_price += 5000;
									DB.upLoad(1);
									break;
								}
							}
						}
						if(timech == 4) {
							for(int i =0; i<MemberController.memberlist.size(); i++) {
								if(MemberController.memberlist.get(i).getId().equals(id)) {
									idx_1 = i;
									MemberController.memberlist.get(idx_1).setTime(MemberController.memberlist.get(idx_1).getTime() + 36000);
									MemberController.memberlist.get(idx_1).setMoney(MemberController.memberlist.get(idx_1).getMoney() + 10000);
									ac.total_price += 10000;
									DB.upLoad(1);
									break;
								}
							}
						}
					}
					mc.timeControll();
				}
			}
		
			if(ch == 2) {
					System.out.print("ID : ");
					String id = Kiosk.sc.next();
					System.out.print("PW : ");
					String pw = Kiosk.sc.next();
					
					boolean Logcheck = MemberController.login(id, pw);
					
					for(int i = 0; i < mc.memberlist.size(); i++) {
						if(mc.memberlist.get(i).getId().equals(id)) {
							idx_1 = i;
							if(mc.memberlist.get(idx_1).getTime() <= 0) {
								Logcheck = false;
							}
						}
					}
					
					if(id.equals("admin")) {
						System.out.println("�¼��� ������ �� �����ϴ�.");
						continue;
					}

					for(int i =0; i<MemberController.memberlist.size(); i++) {
						if(MemberController.memberlist.get(i).getId().equals(id)) {
							idx_1 = i;
						}
					}
				
				if(Logcheck) {
					System.out.println("------------------  �¼� ����  ------------------");
					System.out.println("\t���ϴ� �¼� ��ȣ�� ������.");
					System.out.print("----->");
					ch2 = Kiosk.sc.nextInt();

					for(int i = 1; i < seat.size(); i++) {
						if(ch2 == i) {
							if(seat.get(i - 1).equals(seatEnough)) { //��ȣ�� 123~ �ڸ� �ε����� 012~
								System.out.println("������ �ڸ��� ������Դϴ�.");
							} else {
								seat.set(i - 1, seatEnough).replace(seatEmpty, seatEnough); //?
								System.out.println("������ �ڸ����� �α��� ���ּ���.");
							}
						}
					}
				} else {
					System.out.println("ȸ�������� Ʋ���ų� �ð� ������ �ʿ��մϴ�.");
				}
				
			} else if(ch == 3) {
				System.out.println("�ڸ� Ȯ���� ���� �α��� �ʿ�");
				System.out.print("ID : ");
				String id = Kiosk.sc.next();
				System.out.print("PW : ");
				String pw = Kiosk.sc.next();
				
				boolean Logcheck = MemberController.login(id, pw);
				
				for(int i = 0; i < seat.size(); i++) {
					if(id.equals("admin") || seat.get(i).equals(seatEnough)) {
						sw = false;
						break;
					} 
				}
				if(sw) {
					System.out.println("�¼� ���� �� �̿� �ٶ��ϴ�.");
					sw = true;
					continue;
				}
				
				boolean run = true;
				if(Logcheck) {
					long firstTime = System.nanoTime();
					kkkkk1 = (int)(firstTime/1000000000);
					while(run) {
						if(id.equals("admin")) {
							System.out.println("[�˸�] ������ �α��� ����");
							System.out.println(" 1. ȸ������ 2. ���Ȯ�� 3. ����� 4. ����Ȯ�� 5. ������");
							int adminCh = Kiosk.sc.nextInt();
								
							if(adminCh == 1){
								mc.info();
								continue;
							} else if(adminCh == 2) {
								ac.order_status();
								continue;
							} else if(adminCh == 3){
								ac.enroll();
								continue;
							} else if(adminCh == 4) {
								ac.sales();
								continue;
							} else if(adminCh == 5){
								break;
							} 
						continue;	
						}
				String[] gamement = {"�ν�Ʈ��ũ : ������ �Ƿ���", "�� : ��ȥ�� ��Ÿ��", "GTA5 : ���� �̼� ������", "��ƺ��2 : ���ǽ��� �޹���"
						, "����4 : ī��� �ϴ���", "��Ÿũ����Ʈ : �պ����� ������", "��Ʋ�׶��� : TOP10�̶� ������", "���̹����� : �ο��� ������"
						, "��Ʃ�� : ����ä�� ���鼭 �ǽĴ����", "�� ������ �� ì��� ��"};
				
						
						System.out.println("------------------  ���� �¼�  ------------------");
						System.out.println("�¼� ��ȣ : " + (seat.indexOf(seatEnough) + 1));
						System.out.println("EZEN PC�濡 ���Ű��� ȯ���մϴ�.");
						System.out.println("�ڷγ� Ȯ�� ������ ���� ����ũ�� �׽� ����ٶ��ϴ�.");
						System.out.println("1. ����\t2. �԰Ÿ�\t3. �α׾ƿ�");
						System.out.print("���ϴ� �޴� ���� : ");
						ch3 = Kiosk.sc.nextInt();
						
						
						if(ch3 == 1) {
							try {
								 for(int i = 0; i < 10; i++){
									System.out.println(gamement[i]);
									Thread.sleep(500);
								}
								 
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						} else if(ch3 == 2) {
							System.out.println("------------------  �԰� ����  ------------------");
							
							ac.client_order(); // *********
						} else {
							for(int i = 0; i < seat.size(); i++) {
								if(ch2 == i) {
									if(seat.get(i - 1).equals(seatEnough)) {
										seat.set((i - 1), seatEmpty).replace(seatEnough, seatEmpty);
										System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
									}
								}
							}
							break;
						}
					}
					long endTime = System.nanoTime();
					int kkkkk2 = (int)(endTime/1000000000);
					int kkkkk = (int)(kkkkk2 - kkkkk1);
						if(!id.equals("admin")) {
							
						System.out.println("���ð� : " + kkkkk  + "��"); // �ð�, ��, �ʷ� ���
						for(int i = 0; i < MemberController.memberlist.size(); i++) {
							if(MemberController.memberlist.get(i).getId().equals(id)) {
								idx_1 = i;
								MemberController.memberlist.get(idx_1).setTime(MemberController.memberlist.get(idx_1).getTime() - kkkkk);
								mc.timeControll();
								DB.upLoad(1);
								break;
							}
						}
					}
				}
			}
		}
	}
}
