package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtserver.setEditable(false); // ��������
		
	}
	
	@FXML
	private TextArea txtserver;
	
	@FXML
	private Button btnserver;
	
	@FXML
	private Label lblserver;
	
	@FXML
	void start (Action event) {
		if (btnserver.getText().equals("��������") ) {
			// 1. ��������
			// 2. �޽���â�� ���� ����
				// Platform.runLater(	() -> {}	;
			Platform.runLater( () -> {
				
				txtserver.setText(" [ --- server start --- ]\n");
				// 3. ��ư �̸� ����
				btnserver.setText("��������");
				lblserver.setText("���� ������");
				
			});
			

			
		} else {
			Platform.runLater( () -> { 
			txtserver.setText( " [ --- server stop --- ]\n" );
			btnserver.setText("���� ����");
			lblserver.setText("���� ������");
			} );
			
			
		} 
	}
	
	
	
	
}
