package controller;

import java.io.File;
import java.nio.channels.FileChannel;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ProductregisterController {
	@FXML
    private Button btncancel;

    @FXML
    private Button btnimgadd;

    @FXML
    private Button btnregister;

    @FXML
    private ToggleGroup category;

    @FXML
    private Label lblimgpath;

    @FXML
    private RadioButton opt_1;

    @FXML
    private RadioButton opt_2;

    @FXML
    private RadioButton opt_3;

    @FXML
    private RadioButton opt_4;

    @FXML
    private ImageView pimg;

    @FXML
    private TextArea txtpcontents;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtprice;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productlist");
    }

    
    @FXML
    void register(ActionEvent event) {
    	
    	// 유효성검사
    	String pname = txtpname.getText(); // 제품명
    	String pcontents = txtpcontents.getText(); // 제품설명
    	int pprice = Integer.parseInt(txtprice.getText() ); // 가격 // 정수형형변환
    	String pcatagory = "";
    		if ( opt_1.isSelected() ) { pcatagory = "의류" ; } //해당 라디오버튼을 클릭 시
    		if ( opt_2.isSelected() ) { pcatagory = "신발" ; } //해당 라디오버튼을 클릭 시
    		if ( opt_3.isSelected() ) { pcatagory = "가방" ; } //해당 라디오버튼을 클릭 시
    		if ( opt_4.isSelected() ) { pcatagory = "ACC" ; } //해당 라디오버튼을 클릭 시
    		

    		// 로그인된 id의 회원번호 검색 db처리 - 21.11.04
    		int m_no = MemberDao.getMemberDao().
    				bnocheck( MainpageController.getinstance().getloginid() );
    		
    	
    	// 객체화 [ 상태 초기값 = 1 ]
    	Product product = new Product ( pname, pimage, pcontents, pcatagory, pprice, 1, m_no );
    	
    	// DB처리  - 21.11.04
    	boolean result =  ProductDao.getProductDao().register(product);
    	
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if( result ) {
    		alert.setHeaderText("제품 등록 성공"); alert.showAndWait();	// 메시지창 띄우기 
    		MainpageController.getinstance().loadpage("productlist"); // 페이지 전환 
    	}
    	
    }
    
    // 파일 경로 찾기
    private String pimage; // 파일 경로 저장할 변수
    private Stage stage; // 파일 경로 찾을 화면
    
    @FXML
    void imgadd(ActionEvent event) {
    	
    	// 1. 파일 선택 클래스 
    	FileChooser fileChooser = new FileChooser(); // 파일 선택시 경로 저장 
    	// 2. 파일 스테이지 설정  getExtensionFilters : 선택할 파일 필터 
    	fileChooser.getExtensionFilters().add(
    			new ExtensionFilter("그림파일 : Image File" , "*png" , "*jpg" , "*gif" ) );
    	// 3. 스테이지에 파일선택클래스 넣기 
    	File file =  fileChooser.showOpenDialog(stage);
    	
    	// * 선택한 파일을 파일클래스에 저장
    	lblimgpath.setText("파일경로 : " + file.getPath() );
    	
    	//
    	pimage = file.toURI().toString(); // 파일의 실제[real] 경로
//    	System.out.println("URL 경로 : ");
//    	System.out.println("URI 경로 : " + pimage );
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    	
    	
    }
    
    
    
    
    
    
}
