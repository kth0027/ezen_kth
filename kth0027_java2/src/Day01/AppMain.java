package Day01;

import javafx.application.Application;
// import : javafx

import javafx.stage.Stage;

public class AppMain extends Application {
	// 1. Application : javafx 에게 상속받기

	// 2. 오버라이딩 : start 메소드
	@Override
	public void start(Stage 스테이지) throws Exception {
		// 3. Stage 이름 정하기
		스테이지.show();
		// 4. 해당 stage 실행
	}

	public static void main(String[] args) {
		launch(args);
	}

}