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
		// 0. ��Ʈ�� ȣ��� => fx:id ȣ�� [��ü] 
		
		// 1. ��ȿ���˻�
			// 1-1. ���̵� ����
			if (txtid.getText().length() < 4 || txtid.getText().length() > 13 ) { lblconfirm.setText("���̵�� 4���� ~ 12���ڷθ� �����մϴ�"); // ���̺� ����
				return; // �޼ҵ� ��
			}
			
			// 1-2. �н����� ����
			if ( txtpassword.getText().length() < 4 || txtpassword.getText().length() > 9 ) { lblconfirm.setText("��й�ȣ�� 4~8���ڷ� �����մϴ�"); // ���̺� ����
				return; // �޼ҵ� ��
			}
			
			// 1-3. �н����� ����üũ
			if ( !txtpassword.getText().equals(txtpasswordconfirm.getText() ) ) { lblconfirm.setText("��й�ȣ�� �������� �ʽ��ϴ�"); // ���̺� ����
				return; // �޼ҵ� ��
			}
			
			// 1-4. �̸����� üũ
			if ( txtname.getText().length() < 2 ) { lblconfirm.setText("�̸��� 2���� �̻����� �� �����մϴ�"); // ���̺� ����
				return; // �޼ҵ� ��
			}
			
			// 1-5. �̸��� ����üũ
			if ( txtemail.getText().length() < 5 && !txtemail.getText().contains("@") ) { lblconfirm.setText(" �̸��� ��������(@����) �Է��ϼž� �մϴ�"); // ���̺� ����
				return; // �޼ҵ� ��
			}
			
	// 2. �ߺ�üũ [21.11.02.ȭ]
			boolean idcheck =  MemberDao.getMemberDao().idcheck( txtid.getText() );
	    	if( idcheck ) {  lblconfirm.setText("���� ������� ���̵� �Դϴ�. "); return;  }
			
							
			// 3. ��üȭ 
	    	Member member = new Member(txtid.getText(), txtpassword.getText(),
	    								txtname.getText(), txtemail.getText() );
			
			// 4. ���� Ȥ�� DBó�� �ڡڡڡڡڡڡڡڡڡڡڡڡڡ� sql memberdao �ۼ���
			boolean result = MemberDao.getMemberDao().signup(member); // DB �޼ҵ� ȣ��
			if (result) { // DB ������
				lblconfirm.setText( " �������ּż� �����մϴ� ");
				// 5. �޼���â ����� ������ ��ȯ
				Alert alert = new Alert( AlertType.INFORMATION ); // 1. �޽��� ��ü ���� 
	    		alert.setContentText("  ȸ������ ����  "); // 2. �޽��� ���� 
	    		alert.setHeaderText(" Nike community ������ �����մϴ�. * ����Ʈ 1000 ���� *"); // 3. �޽��� ���� 
	    		alert.setTitle("�˸�");
	    		alert.showAndWait(); // 4. �޽����� ���� ��ư �Է½ñ��� ��� 
	    		LoginController.getinstance().loadpage("login"); // �α���fxml ���Ϸ� �̵�
 			} else { // DB ���н�
 				lblconfirm.setText("ȸ������ ���� [ �����ڿ��Թ��� : DB ���� ]");
 			}			
	}
	
	@FXML
	void back(MouseEvent event) {
		// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
	// LoginController loginController = new LoginController();

		// ������ �޸� ����ϱ� ���� this Ű���带 ����� ��ü ȣ��
		LoginController.getinstance().loadpage("login");

	}

	

}