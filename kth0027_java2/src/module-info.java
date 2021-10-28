module kth0027_java2 {
	requires javafx.controls;
	requires javafx.fxml; // ¼±¾ð
	
	opens application to javafx.graphics, javafx.fxml;
	opens Day01 to javafx.graphics, javafx.fxml;
	opens App to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml; 
}

