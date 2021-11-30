package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	lblconfirm.setText("");	
	}

	@FXML
	private Label btnback;

	@FXML
	private Button btnsignup;

	@FXML
	private Label lblconfirm;
	
	@FXML
	private AnchorPane signuppane;

	@FXML
	private TextField txtemail;

	@FXML
	private TextField txtid;

	@FXML
	private TextField txtname;

	@FXML
	private PasswordField txtpassword;

	@FXML
	private PasswordField txtpasswordconfirm;
	
	@FXML
	void signup(ActionEvent event) {
		// 0. 컨트롤 호출시 => fx:id 호출 [객체] 
		
		// 1. 유효성검사
			// 1-1. 아이디 길이
			if (txtid.getText().length() < 4 || txtid.getText().length() > 13 ) { lblconfirm.setText("아이디는 4글자 ~ 12글자로만 가능합니다"); // 레이블 변경
				return; // 메소드 끝
			}
			
			// 1-2. 패스워드 길이
			if ( txtpassword.getText().length() < 4 || txtpassword.getText().length() > 9 ) { lblconfirm.setText("비밀번호는 4~8글자로 가능합니다"); // 레이블 변경
				return; // 메소드 끝
			}
			
			// 1-3. 패스워드 동일체크
			if ( !txtpassword.getText().equals(txtpasswordconfirm.getText() ) ) { lblconfirm.setText("비밀번호가 동일하지 않습니다"); // 레이블 변경
				return; // 메소드 끝
			}
			
			// 1-4. 이름길이 체크
			if ( txtname.getText().length() < 2 ) { lblconfirm.setText("이름은 2글자 이상으로 만 가능합니다"); // 레이블 변경
				return; // 메소드 끝
			}
			
			// 1-5. 이메일 길이체크
			if ( txtemail.getText().length() < 5 && !txtemail.getText().contains("@") ) { lblconfirm.setText(" 이메일 형식으로(@포함) 입력하셔야 합니다"); // 레이블 변경
				return; // 메소드 끝
			}
			
	// 2. 중복체크 [21.11.02.화]
			boolean idcheck =  MemberDao.getMemberDao().idcheck( txtid.getText() );
	    	if( idcheck ) {  lblconfirm.setText("현재 사용중인 아이디 입니다. "); return;  }
			
							
			// 3. 객체화 
	    	Member member = new Member(txtid.getText(), txtpassword.getText(),
	    								txtname.getText(), txtemail.getText() );
			
			// 4. 파일 혹은 DB처리 ★★★★★★★★★★★★★★ sql memberdao 작성후
			boolean result = MemberDao.getMemberDao().signup(member); // DB 메소드 호출
			if (result) { // DB 성공시
				lblconfirm.setText( " 가입해주셔서 감사합니다 ");
				// 5. 메세지창 띄오고 페이지 전환
				Alert alert = new Alert( AlertType.INFORMATION ); // 1. 메시지 객체 생성 
	    		alert.setContentText("  회원가입 성공  "); // 2. 메시지 내용 
	    		alert.setHeaderText(" Nike community 가입을 축하합니다. * 포인트 1000 지급 *"); // 3. 메시지 제목 
	    		alert.setTitle("알림");
	    		alert.showAndWait(); // 4. 메시지를 띄우고 버튼 입력시까지 대기 
	    		LoginController.getinstance().loadpage("login"); // 로그인fxml 파일로 이동
 			} else { // DB 실패시
 				lblconfirm.setText("회원가입 실패 [ 관리자에게문의 : DB 오류 ]");
 			}			
	}
	
	@FXML
	void back(MouseEvent event) {
		// !! 새로운 객체 선언시에는 새로운 메모리
	// LoginController loginController = new LoginController();

		// 동일한 메모리 사용하기 위해 this 키워드를 사용한 객체 호출
		LoginController.getinstance().loadpage("login");

	}

	

}
