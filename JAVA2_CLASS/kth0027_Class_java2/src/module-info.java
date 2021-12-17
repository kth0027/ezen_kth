module kth0027_java2 {
	requires javafx.controls;
	requires javafx.fxml; // 선언
	requires java.sql;		// sql 관련 라이브러리
	requires mail; 			// mail 관련 라이브러리
	requires activation; 	// mail 관련 라이브러리
	
	opens Day01 to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics, javafx.fxml;
	
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml; 
	opens dao to java.sql;
	opens domain to mail , activation , javafx.base;
									// view 출력하기위해 넣음
}	


