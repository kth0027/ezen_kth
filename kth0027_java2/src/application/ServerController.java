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
		txtserver.setEditable(false); // 수정금지
		
	}
	
	@FXML
	private TextArea txtserver;
	
	@FXML
	private Button btnserver;
	
	@FXML
	private Label lblserver;
	
	@FXML
	void start (Action event) {
		if (btnserver.getText().equals("서버실행") ) {
			// 1. 서버실행
			// 2. 메시지창에 내용 띄우기
				// Platform.runLater(	() -> {}	;
			Platform.runLater( () -> {
				
				txtserver.setText(" [ --- server start --- ]\n");
				// 3. 버튼 이름 변경
				btnserver.setText("서버중지");
				lblserver.setText("서버 실행중");
				
			});
			

			
		} else {
			Platform.runLater( () -> { 
			txtserver.setText( " [ --- server stop --- ]\n" );
			btnserver.setText("서버 실행");
			lblserver.setText("서버 중지중");
			} );
			
			
		} 
	}
	
	
	
	
}
