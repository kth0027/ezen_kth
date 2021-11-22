package Day02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Day02_1 extends Application {
					// 1. java fx 상속
	
	@Override
	public void start(Stage stage) throws Exception {	// 2. start	메소드 오버라이딩
							// 3. stage 이름 선정
		
		// 6. 씬빌더 파일 가져오기
			// 1.
				// fxml 동일한 패키지 없을 경우
			Parent parent = FXMLLoader.load(getClass().getResource("/Day02_test.fxml"));
		// fxml 동일한 패키지에 있을 경우
		
		// Parent parent = FXMLLoader.load(getClass().getResource("/test1.fxml"));
		
			// 2. 씬에 넣기
			Scene scene = new Scene(parent);
			
			// 3. 스테이지에 씬 넣기
			stage.setScene(scene);
		
		
		
		stage.show(); // 4. 스테이지 시작
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
