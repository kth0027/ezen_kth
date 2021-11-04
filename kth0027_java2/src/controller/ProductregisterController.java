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
    	
    	// ��ȿ���˻�
    	String pname = txtpname.getText(); // ��ǰ��
    	String pcontents = txtpcontents.getText(); // ��ǰ����
    	int pprice = Integer.parseInt(txtprice.getText() ); // ���� // ����������ȯ
    	String pcatagory = "";
    		if ( opt_1.isSelected() ) { pcatagory = "�Ƿ�" ; } //�ش� ������ư�� Ŭ�� ��
    		if ( opt_2.isSelected() ) { pcatagory = "�Ź�" ; } //�ش� ������ư�� Ŭ�� ��
    		if ( opt_3.isSelected() ) { pcatagory = "����" ; } //�ش� ������ư�� Ŭ�� ��
    		if ( opt_4.isSelected() ) { pcatagory = "ACC" ; } //�ش� ������ư�� Ŭ�� ��
    		

    		// �α��ε� id�� ȸ����ȣ �˻� dbó�� - 21.11.04
    		int m_no = MemberDao.getMemberDao().
    				bnocheck( MainpageController.getinstance().getloginid() );
    		
    	
    	// ��üȭ [ ���� �ʱⰪ = 1 ]
    	Product product = new Product ( pname, pimage, pcontents, pcatagory, pprice, 1, m_no );
    	
    	// DBó��  - 21.11.04
    	boolean result =  ProductDao.getProductDao().register(product);
    	
    	Alert alert = new Alert( AlertType.INFORMATION );
    	if( result ) {
    		alert.setHeaderText("��ǰ ��� ����"); alert.showAndWait();	// �޽���â ���� 
    		MainpageController.getinstance().loadpage("productlist"); // ������ ��ȯ 
    	}
    	
    }
    
    // ���� ��� ã��
    private String pimage; // ���� ��� ������ ����
    private Stage stage; // ���� ��� ã�� ȭ��
    
    @FXML
    void imgadd(ActionEvent event) {
    	
    	// 1. ���� ���� Ŭ���� 
    	FileChooser fileChooser = new FileChooser(); // ���� ���ý� ��� ���� 
    	// 2. ���� �������� ����  getExtensionFilters : ������ ���� ���� 
    	fileChooser.getExtensionFilters().add(
    			new ExtensionFilter("�׸����� : Image File" , "*png" , "*jpg" , "*gif" ) );
    	// 3. ���������� ���ϼ���Ŭ���� �ֱ� 
    	File file =  fileChooser.showOpenDialog(stage);
    	
    	// * ������ ������ ����Ŭ������ ����
    	lblimgpath.setText("���ϰ�� : " + file.getPath() );
    	
    	//
    	pimage = file.toURI().toString(); // ������ ����[real] ���
//    	System.out.println("URL ��� : ");
//    	System.out.println("URI ��� : " + pimage );
    	
    	Image image = new Image(pimage);
    	pimg.setImage(image);
    	
    	
    }
    
    
    
    
    
    
}
