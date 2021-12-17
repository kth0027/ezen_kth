package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.MemberDao;
import dao.ProductDao;
import domain.Board;
import domain.Member;
import domain.Product;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MyinfoController implements Initializable{
	
	
    @FXML // 21.11.05
    private TableView<Board> myboardlist;

    @FXML // 21.11.05
    private TableView<Product> myproductlist;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
 
		// 1. �α��� �� ���̵�� DB���� ȸ������ ã��
		String loginid = MainpageController.getinstance().getloginid();
		
		///////////////////////////////////////////////////////////////
		Member member = MemberDao.getMemberDao().getmember(loginid);
		
		// 21.11.05 ���̺��� �߰�
		ObservableList<Board> boards = BoardDao.getboardDao().myboardlist( loginid );
		myboardlist.setItems(boards);
	
		TableColumn tc = myboardlist.getColumns().get(0);
			tc.setCellValueFactory( new PropertyValueFactory<>("b_no"));
		tc = myboardlist.getColumns().get(1);
			tc.setCellValueFactory( new PropertyValueFactory<>("b_title"));
		tc = myboardlist.getColumns().get(2);
			tc.setCellValueFactory( new PropertyValueFactory<>("b_date"));
		tc = myboardlist.getColumns().get(3);
			tc.setCellValueFactory( new PropertyValueFactory<>("b_view"));

		// ���� ����� ��ǰ �������� 21.11.05

		int m_no = MemberDao.getMemberDao().mnocheck(loginid); // ȸ��id -> ȸ����ȣ 
		ObservableList<Product> products = ProductDao.getProductDao().myproductlist( m_no );
		myproductlist.setItems(products);

		tc = myproductlist.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_name"));
		tc = myproductlist.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_category"));
		tc = myproductlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_price"));
		tc = myproductlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_activation"));
//		tc.setCellFactory(new PropertyValueFactory<>("activation"));
		tc = myproductlist.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("p_date"));
				
			
		
		// 2. DB���� ã�� ȸ������ ���̺��� �ֱ�
		lblid.setText( member.getM_id() );
		lblname.setText( member.getM_name() );
		lblemail.setText( member.getM_email() );
		lblpoint.setText( member.getM_point() + "" );
		
		
	}
	
	
	@FXML
	private Button btndelete;

	@FXML
	private Button btnupdate;
	

	@FXML
	private Label lblemail;

	@FXML
	private Label lblid;

	@FXML
	private Label lblname;
	
	@FXML
	private Label lblpoint;

	@FXML
	void delete(ActionEvent event) {
		
		// 1. �޼���â ����
		Alert alert = new Alert ( AlertType.CONFIRMATION);
		alert.setTitle("�˸�");
//		alert.setContentText(" ȸ��Ż�� ");
		alert.setHeaderText(" ���� ȸ��Ż�� �Ͻðڽ��ϱ�? ");
		
		Optional<ButtonType> optional = alert.showAndWait();
		
		if ( optional.get() == ButtonType.OK ) {
			// ȸ��Ż�� ����
			boolean result =  MemberDao.getMemberDao().
    				delete( lblid.getText() );
    		
    		Alert alert2 = new Alert( AlertType.INFORMATION );
			
			if (result) {
				
				alert2.setHeaderText("ȸ��Ż�� �Ǿ����ϴ�");
    			alert2.setTitle("�˸�");
    			alert2.showAndWait();
    			
    			
				// 1. main �������� �����
				btndelete.getScene().getWindow().hide();

				// 2. login �������� ����
				Stage stage = new Stage();
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
					Scene scene = new Scene(parent);
					stage.setScene(scene);

					//// ������ ǥ�� ���� ///
					stage.setResizable(false); // �������� ũ�� ����
					stage.setTitle("Nike"); // �������� �̸�
					// �������� ������
					// 1. �̹��� �ҷ�����
					Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
//					Image image = new Image("C:/Users/pc/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png"); // �� PC
//					Image image = new Image("C:/Users/504/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png"); // �п� ���ڸ� pc
					stage.getIcons().add(image);

					stage.show();
				} catch (Exception e) {}

			} else {
				alert2.setHeaderText(" DB ���� [ ������ ���� ���� ]");
    			alert2.setTitle("�˸�");
    			alert2.showAndWait();
    		}
			
		} 
		
		
	}

	@FXML
	void update(ActionEvent event) {
		MainpageController.getinstance().
		loadpage("myinfoupdate");
	}
	
	
}