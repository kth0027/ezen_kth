package Day01;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
					// 1. Application : javafx ���� ��ӹޱ�
	
	// 2. �������̵� : start �޼ҵ�
	@Override
	public void start (Stage primaryStage) throws Exception {
						// 3. Stage �̸� ���ϱ�
			primaryStage.show();
			// 4. �ش� stage ����
	}
	
	public static void main(String[] args) {
		launch(args); // 5. Start �޼ҵ� ȣ��
	}

}