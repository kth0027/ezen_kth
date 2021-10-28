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
    		// !! 새로운 객체 선언시에는 새로운 메모리
    	
    	// 1. 메소드 호출방법 (login > 객체화 해서 불러오자)

    	// LoginController loginController = new LoginController();
    	
    	
    	// 동일한 메모리 사용하기 위해 this 키워드를 사용한 객체 호출
    	    	LoginController.getinstance().loadpage("login");
    	
    	
    }
    
    
 
}
