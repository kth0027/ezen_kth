package controller.membercontroller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FindpasswordController implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	lblconfirm.setText("");
		
	}
    @FXML
    private Label btnback;

    @FXML
    private Button btnfindpassword;

    @FXML
    private AnchorPane findpasswordpane;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtdob;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtid;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtphone;

    @FXML
    void back(MouseEvent event) {
    	LoginController.getinstance().loadpage("loginpage");
    }

    @FXML
    void findpassword(ActionEvent event) {
    	System.out.println( txtid.getText()+ txtname.getText()+ txtemail.getText()+ txtdob.getText()+ txtphone.getText() );
    	String result = MemberDao.getMemberDao().findpassword(txtid.getText(), txtname.getText(), txtemail.getText(), txtdob.getText(), txtphone.getText());
    	
    	if(result != null ) {
    		Member.sendmail(txtemail.getText(), result, 2);
    		lblconfirm.setText("ȸ������ ��й�ȣ�� �̸��Ϸ� �����߽��ϴ�.");
    	}
    	else { lblconfirm.setText("��ġ�ϴ� ������ �������� �ʽ��ϴ�."); }
    }
}
