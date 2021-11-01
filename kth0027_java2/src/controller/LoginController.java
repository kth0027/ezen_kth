package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
										// �ʱ�ȭ ���õ� �޼ҵ� ���
	// ��üȭ (ȣ���ϱ�����)
		// 1. static ��������
	
	private static LoginController instance;
	
	public LoginController() {
		// 2. ���� Ŭ������ �޸� ȣ�� > this
		instance = this;           // ���� Ŭ������ �޸� ȣ�� = this
	}
	
		// 3. private instance ��ȯ
	public static LoginController getinstance() {
		return instance;
	}
	
		// 4. �α��� �� �Էµ� ���̵� ��ȯ �ڡڡڡڡڡڡڡڡڡ�
	public String getid() {
		return txtid.getText();
	}
	
	// fxml ���� �� �ʱⰪ ���� �޼ҵ�
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // ���޽����� ���� ����
	}
	
	
	/////////////////////////////////////////////////////////////

	@FXML
    private Label btnfind;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private BorderPane mainboardpane;

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void findid(MouseEvent event) {
    	loadpage("findid");
    }

    @FXML
    void findpassword(MouseEvent event) {
    	loadpage("findpassword");
    }

    @FXML
    void login(ActionEvent event) {
    	
    	// 1. Dao��ü login�޼ҵ� ȣ�� [ login �޼ҵ��� ���̵�� ��й�ȣ �ֱ� ] 
    	boolean result =  MemberDao.getMemberDao()
    						.login(txtid.getText(), txtpassword.getText());
 
    	if( result ) {
    		lblconfirm.setText(" �α��� ���� ");
    		
    		// ���� �������� ���� �ڡڡڡڡڡڡڡ�
    		btnlogin.getScene().getWindow().hide();  // �ش� ��ư�� �� ��� �ݱ�
    		
    		// ���������� �������� ���� �ڡڡڡڡڡڡڡ�
    		Stage stage = new Stage();
    		try {
    			Parent parent = FXMLLoader.load( getClass().getResource("/fxml/mainpage.fxml"));
    			Scene scene = new Scene( parent );
    			stage.setScene(scene);
    			
    				//// ������ ǥ�� ���� ///
	    			stage.setResizable(false); // �������� ũ�� ���� 
	    			stage.setTitle("Nike"); // �������� �̸� 
	    			// �������� ������ 
	    				// 1. �̹��� �ҷ�����
	    				Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
	    				stage.getIcons().add(image);

	    				
	    				
    			stage.show();
    		}
    		catch (Exception e) {
				// TODO: handle exception
			}
    		
    		
    	}else {
    		lblconfirm.setText(" �α��� ���� : ������ ȸ�������� �����ϴ�");
    	}
    	// �ƴϸ� ���� 
    	
//    	// txt �Էµ� ���̵�� �н����� ȸ���� �����ϸ� �α��� ����
//    	if ( txtid.getText().equals("admin")&& txtpassword.getText().equals("1234") ) {
//    		// ���̵�� �н����尡 �����ϸ� �α��� ����
//    		lblconfirm.setText("�α��μ���");
//    	} else {
//    		lblconfirm.setText(" �α��� ���� : ������ ȸ�� ������ �����ϴ� ");
//    	}

    }

    @FXML
    void signup(MouseEvent event) {
    	loadpage("signup");
    }
    
    // boarderpane center ���� 
    public void loadpage( String page ) {
    	try {
    		Parent parent = FXMLLoader.load(
    				getClass().getResource("/fxml/"+page+".fxml"));
    		mainboardpane.setCenter(parent);
    	}
    	catch (Exception e) {}
    }
    
	

}
