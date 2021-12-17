package controller.boardcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
//import dao.MemberDao;
//import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class MyinfoupdateController implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// �α����� ���̵��� db���� ȸ������ ������
	String loginid = MainpageController.getinstance().getloginid();
	Member member = MemberDao.getMemberDao().getMember(loginid);
		
	lblloginid.setText(member.getM_id());
	lblloginid2.setText(member.getM_id());
	lblloginname.setText(member.getM_name());
	}

    @FXML
    private Button btncancel;

    @FXML
    private Button btnupdate;

    @FXML
    private TextField lblemail;

    @FXML
    private Label lblloginid;

    @FXML
    private Label lblloginid2;

    @FXML
    private Label lblloginname;

    @FXML
    private PasswordField lblpassword;

    @FXML
    private PasswordField lblpasswordconfirm;

    @FXML
    private TextField lblphone;
    
    @FXML
    void back(ActionEvent event) {
    	MainpageController.getinstance().loadpage("myinfo");
    	
    }
 
    @FXML
    void update(ActionEvent event) {
    	
    	
    	if(lblpassword.getText().equals(lblpasswordconfirm.getText())) {
    		
    		boolean result = MemberDao.getMemberDao().update( lblloginid2.getText(),  lblpassword.getText(),  lblemail.getText(),  lblphone.getText() );
    		System.out.println( result );
    		Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("ȸ������ �����Ϸ�"); alert.showAndWait();
    		MainpageController.getinstance().loadpage("myinfo");
    	
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("��й�ȣ�� ��ġ���� �ʽ��ϴ�."); alert.showAndWait();
    	}
    	
    }

}
