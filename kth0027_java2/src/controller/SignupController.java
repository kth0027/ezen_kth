package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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

	@FXML
	private Button btnsignup;

	@FXML
	private Label lblconfirm;

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

	}

}
