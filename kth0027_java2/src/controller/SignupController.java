package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SignupController {

    @FXML
    private Label btnback;

    @FXML
    private AnchorPane signuppane;

    @FXML
    void back(MouseEvent event) {
    		// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
    	
    	// 1. �޼ҵ� ȣ���� (login > ��üȭ �ؼ� �ҷ�����)

    	// LoginController loginController = new LoginController();
    	
    	
    	// ������ �޸� ����ϱ� ���� this Ű���带 ����� ��ü ȣ��
    	    	LoginController.getinstance().loadpage("login");
    	
    	
    }
    
    
 
}
