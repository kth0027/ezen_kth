package Day02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Day02_1 extends Application {
					// 1. java fx ���
	
	@Override
	public void start(Stage stage) throws Exception {	// 2. start	�޼ҵ� �������̵�
							// 3. stage �̸� ����
		
		// 6. ������ ���� ��������
			// 1.
				// fxml ������ ��Ű�� ���� ���
			Parent parent = FXMLLoader.load(getClass().getResource("/Day02_test.fxml"));
		// fxml ������ ��Ű���� ���� ���
		
		// Parent parent = FXMLLoader.load(getClass().getResource("/test1.fxml"));
		
			// 2. ���� �ֱ�
			Scene scene = new Scene(parent);
			
			// 3. ���������� �� �ֱ�
			stage.setScene(scene);
		
		
		
		stage.show(); // 4. �������� ����
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
