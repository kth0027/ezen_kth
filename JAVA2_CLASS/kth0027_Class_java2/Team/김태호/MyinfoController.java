//package 김태호;
//
//import java.net.URL;
//import java.util.Optional;
//import java.util.ResourceBundle;
//
//import dao.MemberDao;
//import domain.Member;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.Label;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.image.Image;
//import javafx.stage.Stage;
//
//public class MyinfoController implements Initializable{
//
//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
// 
//		// 1. 로그인 된 아이디와 DB에서 회원정보 찾기
//		String loginid = MainpageController.getinstance().getloginid();
//		
//		///////////////////////////////////////////////////////////////
//		Member member = MemberDao.getMemberDao().getmember(loginid);
//		
//		// 2. DB에서 찾은 회원정보 레이블에 넣기
//		lblid.setText( member.getM_id() );
//		lblname.setText( member.getM_name() );
//		lblemail.setText( member.getM_email() );
//		lblpoint.setText( member.getM_point() + "" );
//		
//		
//	}
//	
//	@FXML
//    private Button btndelete;
//
//    @FXML
//    private Button btnupdate;
//
//    @FXML
//    private Label lblid;
//
//    @FXML
//    private Label lblpoint;
//
//    @FXML
//    private TextField txtemail;
//
//    @FXML
//    private TextField txtname;
//
//    @FXML
//    void delete(ActionEvent event) {
//    	// 1. 메세지창 띄우기
//    			Alert alert = new Alert ( AlertType.CONFIRMATION);
//    			alert.setTitle("알림");
////    			alert.setContentText(" 회원탈퇴 ");
//    			alert.setHeaderText(" 정말 회원탈퇴 하시겠습니까? ");
//    			
//    			Optional<ButtonType> optional = alert.showAndWait();
//    			
//    			if ( optional.get() == ButtonType.OK ) {
//    				// 회원탈퇴 진행
//    				boolean result =  MemberDao.getMemberDao().
//    	    				delete( lblid.getText() );
//    	    		
//    	    		Alert alert2 = new Alert( AlertType.INFORMATION );
//    				
//    				if (result) {
//    					
//    					alert2.setHeaderText("회원탈퇴 되었습니다");
//    	    			alert2.setTitle("알림");
//    	    			alert2.showAndWait();
//    	    			
//    	    			
//    					// 1. main 스테이지 숨기기
//    					btndelete.getScene().getWindow().hide();
//
//    					// 2. login 스테이지 열기
//    					Stage stage = new Stage();
//    					try {
//    						Parent parent = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//    						Scene scene = new Scene(parent);
//    						stage.setScene(scene);
//
//    						//// 아이콘 표시 설정 ///
//    						stage.setResizable(false); // 스테이지 크기 고정
//    						stage.setTitle("Nike"); // 스테이지 이름
//    						// 스테이지 아이콘
//    						// 1. 이미지 불러오기
//    						Image image = new Image("C:/Users/505/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png");
////    						Image image = new Image("C:/Users/pc/git/ezen_kth/kth0027_java2/src/fxml/stageicon.png"); // 집 PC
//    						stage.getIcons().add(image);
//
//    						stage.show();
//    					} catch (Exception e) {}
//
//    				} else {
//    					alert2.setHeaderText(" DB 오류 [ 관리자 에게 문의 ]");
//    	    			alert2.setTitle("알림");
//    	    			alert2.showAndWait();
//    	    		}
//    				
//    			} 
//    }
//
//    @FXML
//    void update(ActionEvent event) {
//    	MainpageController.getinstance().
//		loadpage("myinfoupdate");
//    }
//	
//	
//	
//	
//	
//	
//	
//	
//}
