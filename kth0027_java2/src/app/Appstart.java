package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Appstart extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		// 1. [���������� �۾�������]fxml �ҷ����� 
		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/findid.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/findpassword.fxml"));

		Scene scene = new Scene(parent);	// 2. parent -> scene
		stage.setScene(scene); 	// 3. scene -> stage ���� ���������� �ֱ�
			stage.setResizable(false); // �������� ũ�� ����
			stage.setTitle("Nike"); // �������� �̸�

			// �������� ������
			// - 1. �̹��� �ҷ�����
			Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
			stage.getIcons().add(image);

		stage.show(); 	// scene -> stage �������� ����

	}

	public static void main(String[] args) {
		launch(args); // main�޼ҵ忡 launch �޼ҵ�ȣ���ϱ�
	}
}
