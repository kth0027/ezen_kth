package ����ȣ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Appstart_����ȣ extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		Parent parent = FXMLLoader.load( getClass().getResource("/fxml/mainpage.fxml"));
		Scene scene = new Scene( parent );
		// ��Ʈ �ε� 
			Font.loadFont( getClass().getResourceAsStream("�������� Bold.ttf"), 14);
			
		// �ܺ� ��Ÿ�Ͻ�Ʈ ���� 
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
		stage.setScene(scene);
			stage.setResizable(false); // �������� ũ�� ���� 
			stage.setTitle("2��"); // �������� �̸� 
			// �������� ������ 
				// 1. �̹��� �ҷ�����
				Image image = new Image("C:/Users/505/git/fx_DB/Fx_ezen/src/fxml/img/stageicon.png");
				stage.getIcons().add(image);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
