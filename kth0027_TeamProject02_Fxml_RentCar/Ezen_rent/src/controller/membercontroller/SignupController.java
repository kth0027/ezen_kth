package controller.membercontroller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController implements Initializable{
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
	    private TextField txtphone;
	    
	    @FXML
	    private TextField txtdob;

	    @FXML
	    void back(MouseEvent event) {
	    	LoginController.getinstance().loadpage("loginpage");
	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	if( txtid.getText().length() < 5 || txtid.getText().length() > 13) {
	    		lblconfirm.setText("���̵�� 5~ 12 ���� ���̷� �����մϴ�."); return;
	    	}
	    	if( txtpassword.getText().length() < 8 || txtpassword.getText().length() > 21) {
	    		lblconfirm.setText("��й�ȣ�� 8 ~ 20 ���� ���̷� �����մϴ�."); return;
	    	}
	    	if( !txtpassword.getText().equals(txtpasswordconfirm.getText())) {
	    		lblconfirm.setText("��й�ȣ�� �������� �ʽ��ϴ�."); return;
	    	}
	    	if( txtname.getText().length() < 2 ) {
	    		lblconfirm.setText("�̸��� 2���� �̻� �����մϴ�."); return;
	    	}
	    	if( txtemail.getText().length() < 5 && !txtemail.getText().contains("@")) {
	    		lblconfirm.setText("�̸����� 5���� �̻� @�� �����Ͽ��� �մϴ�."); return;
	    	}
	    	if( txtdob.getText().length() < 6 || txtdob.getText().length() > 7) { 
	    		lblconfirm.setText("��������� 6�ڸ��� �ۼ����ֽñ� �ٶ��ϴ�. (�ֹι�ȣ ���ڸ�)"); return;
	    	}
	    	if( txtphone.getText().length() < 10 || txtphone.getText().length()>12) {
	    		lblconfirm.setText("����ó�� -�� ������ 10 ~ 11�ڸ��� �Է��Ͻñ� �ٶ��ϴ�. "); return;
	    	}
	    	boolean idcheck = MemberDao.getMemberDao().idcheck(txtid.getText());
	    	if(idcheck) { lblconfirm.setText("���� ������� ���̵��Դϴ�."); return;}
	    	
	    	Member member = new Member(txtid.getText(), txtpassword.getText(), txtname.getText(), txtemail.getText(), txtdob.getText(), txtphone.getText());
	    	
	    	boolean result = MemberDao.getMemberDao().signup(member);
	    	if(result) {
	    		lblconfirm.setText("ȸ������ �Ϸ�");
	    		
	    		Alert alert = new Alert(AlertType.INFORMATION);
	    		alert.setContentText("ȸ������ ����");
	    		alert.setHeaderText("������ �ּż� �����մϴ�.");
	    		alert.setTitle("�˸�");
	    		alert.showAndWait();
	    		LoginController.getinstance().loadpage("loginpage");
	    	}
	    	else { lblconfirm.setText("ȸ������ ���� [������ ����]"); }
	    }

}
