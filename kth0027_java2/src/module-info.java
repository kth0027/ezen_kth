module kth0027_java2 {
	requires javafx.controls;
	requires javafx.fxml; // 선언
	requires java.sql;		// sql 관련 라이브러리
	requires mail; 			// mail 관련 라이브러리
	requires activation; 	// mail 관련 라이브러리
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens Day01 to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics, javafx.fxml;
	
	opens App to javafx.graphics, javafx.fxml;
	
	opens controller to javafx.graphics, javafx.fxml; 
	opens dao to java.sql;
	opens Domain to mail , activation;
}


