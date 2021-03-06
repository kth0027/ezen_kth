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
		
		
 
		// 1. 로그인 된 아이디와 DB에서 회원정보 찾기
		String loginid = MainpageController.getinstance().getloginid();
		
		///////////////////////////////////////////////////////////////
		Member member = MemberDao.getMemberDao().getmember(loginid);
		
		// 21.11.05 마이보더 추가
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

		// 내가 등록한 제품 가져오기 21.11.05

		int m_no = MemberDao.getMemberDao().mnocheck(loginid); // 회원id -> 회원번호 
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
				
			
		
		// 2. DB에서 찾은 회원정보 레이블에 넣기
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
		
		// 1. 메세지창 띄우기
		Alert alert = new Alert ( AlertType.CONFIRMATION);
		alert.setTitle("알림");
//		alert.setContentText(" 회원탈퇴 ");
		alert.setHeaderText(" 정말 회원탈퇴 하시겠습니까? ");
		
		Optional<ButtonType> optional = alert.showAndWait();
		
		if ( optional.get() == ButtonType.OK ) {
			// 회원탈퇴 진행
			boolean result =  MemberDao.getMemberDao().
    				delete( lblid.getText() );
    		
    		Alert alert2 = new Alert( AlertType.INFORMATION );
			
			if (result) {
				
				alert2.setHeaderText("회원탈퇴 되었습니다");
    			alert2.setTitle("알림");
    			alert2.showAndWait();
    			
    			
				// 1. main 스테이지 숨기기
				btndelete.getScene().getWindow().hide();

				// 2. login 스테이지 열기
				Stage stage = new Stage();
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
					Scene scene = new Scene(parent);
					stage.setScene(scene);

					//// 아이콘 표시 설정 ///
					stage.setResizable(false); // 스테이지 크기 고정
					stage.setTitle("Nike"); // 스테이지 이름
					// 스테이지 아이콘
					// 1. 이미지 불러오기
					Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
//					Image image = new Image("C:/Users/pc/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png"); // 집 PC
//					Image image = new Image("C:/Users/504/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png"); // 학원 앞자리 pc
					stage.getIcons().add(image);

					stage.show();
				} catch (Exception e) {}

			} else {
				alert2.setHeaderText(" DB 오류 [ 관리자 에게 문의 ]");
    			alert2.setTitle("알림");
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
