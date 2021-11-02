package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Appstart extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		

		


		// 1. [씬빌더에서 작업한파일]fxml 불러오기 
		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/signup.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/findid.fxml"));
//		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/findpassword.fxml"));
		Scene scene = new Scene(parent);	// 2. parent -> scene
		
//		// [21.11.02.화:폰트 로드]
//		Font.loadFont(getClass().getResourceAsStream("EliceDigitalBaeum_Bold.ttf"), 14);
//		// [21.11.02.화: 외부 스타일 시트 적용]
//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		stage.setScene(scene); 	// 3. scene -> stage 씬을 스테이지에 넣기
			stage.setResizable(false); // 스테이지 크기 고정
			stage.setTitle("Nike"); // 스테이지 이름

			// 스테이지 아이콘
			// - 1. 이미지 불러오기
			Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
			stage.getIcons().add(image);

		stage.show(); 	// scene -> stage 스테이지 실행

	}

	public static void main(String[] args) {
		launch(args); // main메소드에 launch 메소드호출하기
	}
}
