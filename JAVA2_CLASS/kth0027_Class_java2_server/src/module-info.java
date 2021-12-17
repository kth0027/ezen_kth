module kth0027_java2_server {
	requires javafx.controls;
	requires javafx.fxml;

	
	opens application to javafx.graphics, javafx.fxml;
}
