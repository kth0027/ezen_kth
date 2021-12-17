module kth0027_java2 {
	requires javafx.controls;
	requires javafx.fxml; // ����
	requires java.sql;		// sql ���� ���̺귯��
	requires mail; 			// mail ���� ���̺귯��
	requires activation; 	// mail ���� ���̺귯��
	
	opens Day01 to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics, javafx.fxml;
	
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml; 
	opens dao to java.sql;
	opens domain to mail , activation , javafx.base;
									// view ����ϱ����� ����
}	

