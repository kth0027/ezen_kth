package Controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import Model.Member;
import View.Kiosk;

import java.util.Properties;

import Database.DB;



public class MemberController {
	
	public static ArrayList<Member> memberlist = new ArrayList<>();
	
	// �ð�����
	public static void timeControll() {
		int saveTime = memberlist.get(KioskController.idx_1).getTime();
		System.out.println("���� �ð�");
		System.out.printf("%02d : %02d : %02d", (saveTime/3600), (saveTime/60)%60, (saveTime%60));
		System.out.println();
	}
	
	// ȸ������
	public static boolean signup(Member member) {
		
		if(member.getId().length() < 4) {
			System.out.println("[�˸�] ���̵�� 4���� �̻� �����մϴ�.");
			return false;
		}
		
		if(member.getName().length() < 2) {
			System.out.println("[�˸�] �̸��� 2���� �̻� �����մϴ�.");
			return false;
		}
		
		if(member.getPw().length() < 4) {
			System.out.println("[�˸�] �н������ 4���� �̻� �����մϴ�.");
		}
		
		if(!member.getEmail().contains("@")) {
			System.out.println("[�˸�] Email�� @�� �ݵ�� ���Խ����ּ���.");
		}
		
		for(Member temp : memberlist) {
			// temp.getid()�� temp�� member�� ���־��µ� �̷��� �Ǹ� ó�� ȸ�����Ը� �����ϰ� �� ���ķδ� � ���̵� �Է��ص� �ߺ�üũ���� �ɸ�
			if (temp.getId().equals(member.getId())){
				System.out.println("[�˸�] �ߺ��� ���̵� �Դϴ�.");
				return false;
			}
		}
		//����Ʈ�� ����
		memberlist.add(member);
		System.out.println("����Ʈ ����");
		return true;
	}//sign up ��
	
		//���� ó��?
		
		//�̸��� ����
	public static boolean signup() {
		
		return true;
	}
	
	// �α���
	public static boolean login(String id, String pw) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	// ���̵� ã��
	public static boolean forgotId(String name, String email) {
		for(Member temp : memberlist) {
			if(temp.getName().equals(name) && temp.getEmail().equals(email)) {
				System.out.println(temp.getId());
				return true;
			}
		}
		return false;
	}
	
	// ��й�ȣ ã��
	public static boolean forgotPd(String id, String email) {
		for(Member temp : memberlist) {
			if(temp.getId().equals(id) && temp.getEmail().equals(email)) {
				System.out.println(temp.getPw());
				return true;
			}
		}
		return false;
	}
	
	// ȸ������
	public static void info() {
		System.out.println("���̵� ����Ʈ");
		for(int i = 0; i<memberlist.size(); i++) {
			
			System.out.println(memberlist.get(i).getId());
		}
		//�޾ƿ� ��ü (id)
		System.out.println("ȸ�������� ���̵� �Է��ϼ���"); String id = Kiosk.sc.next();
		
		
		for(int i =0; i<memberlist.size(); i++) {
			if(memberlist.get(i).getId().equals(id)) {
				System.out.println("ȸ������ " + (i-1) + "��");
				System.out.println("ID : " + memberlist.get(i).getId());
				System.out.println("�̸� : " + memberlist.get(i).getName());
				System.out.println("E-mail : " + memberlist.get(i).getEmail());
				int save = memberlist.get(i).getTime();
				System.out.printf("���� �ð�\n%02d : %02d : %02d",(save/3600), (save/60)%60, (save%60));
				System.out.println();
				System.out.println("�� ���ݾ� : " + memberlist.get(i).getMoney() + "��");
			}
		}
//		if(member.getId().equals(id)) {
//			int i = 1;
//		//i��°�� = i��° ���
//			for(Member t : memberlist) {
//			
//			System.out.println("ID : " + t.getId());
//			System.out.println("NAME : " + t.getName() );
//			System.out.println("E-mail : " + t.getEmail());
//			System.out.println("���� �ð� : " + t.getTime());
//			i++;
//		// ������� ���
////		System.out.println("�� ��� �ݾ� : ");
////		System.out.println("�� ��� �ð� : ");
//			}
//		}
	}
	
	// ȸ�� ���� ����
	public static boolean update() {
		for(Member t2 : memberlist) {
			System.out.println("ȸ�� ���� ����");
		}
		return true;
	}
	
	// ȸ��Ż��
	public static void signout() {
		
	}
	
//	// 8. �������� �޼ҵ� 
//	public static void sendEmail( String tomail, int type, String contents) {
//								// �޴»�� �̸���  // type : ���̵� ã��(1), ��й�ȣ ã��(2), ���Ը���(3) 
//								// contents : ���Ͽ� ���� ���� 
//		
//		
//		String fromemail = "�̸���";
//		String frompassword = "��й�ȣ";
//		
//		Properties properties = new Properties();
//		properties.put("mail.smtp.host", "smtp.naver.com");  // �߰� ��� ���� ���� ���̹� �ڵ� �з�
//		properties.put("mail.smtp.port", 587); 
//		properties.put("mail.smtp.auth", true); 
//		
//		// 1. ����
//		Session session = Session.getDefaultInstance(properties, new Authenticator() {
//		
//			
//			@Override // �н����� ���� �޼ҵ� 
//			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//													// �н����� ���� 
//				return new javax.mail.PasswordAuthentication(fromemail, frompassword);
//															// ������ �̸��� , ������ �н����� 
//			}
//			
//		}); // ���� ��
//		
//		try {
//			// 2. ���� ������ 
//				// 1. ������ ����� ��������
//			MimeMessage message = new MimeMessage(session);
//				// 2. ������ ����� ���� 
//			message.setFrom(new InternetAddress(fromemail));
//				// 3. �޴� ����� �����ּ� ����
//			message.addRecipient(Message.RecipientType.TO, new InternetAddress(tomail));
//
//			
//			// * type ����
//			if(type == 1) {
//				
//				// 4. ���� ����
//				message.setSubject("EZEN PC�濡 ���̵� ã�� �����Դϴ�.");
//				// 5. ���� ����
//				message.setText("ȸ������ ���̵� : "+ contents);
//			}
//			// type == 2 ��й�ȣ ã��
//			if(type == 2) {
//				message.setSubject("EZEN PC�濡 ��й�ȣ ã�� �����Դϴ�.");
//				message.setText("ȸ������ ��й�ȣ : "+ contents);
//			}
//			// type == 3 ���� ����
//			if(type == 3) {
//				message.setSubject("javaconsole.");
//				message.setText("EZEN PC�� ������ ȯ���մϴ�.");
//			}
//			// 6. ���� ���� 
//			Transport.send(message);
//				
//		}
//		catch (MessagingException e) {
//			e.printStackTrace();
//			System.out.println(" [�˸�] : ���� ���� ���� [�����ڿ��� ����]");
//		} 
//		
//	}
}
