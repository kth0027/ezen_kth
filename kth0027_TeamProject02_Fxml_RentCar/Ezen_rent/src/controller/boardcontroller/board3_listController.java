package controller.boardcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.BoardDao;
import dao.CarDao;
import dao.MemberDao;
import domain.Board;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.AnchorPane;

public class board3_listController implements Initializable{
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
//	
//	public void reservationboardload() {
//		ObservableList<Board> boards = BoardDao.getboardDao().write3();
//		//2. ��ǰ����� ���̺�信 �־��ֱ�
//		cartable.setItems(boards);
//		//3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
//		TableColumn tc = cartable.getColumns().get(0);
//			tc.setCellValueFactory( new PropertyValueFactory<>("r_num"));
//		tc = cartable.getColumns().get(1);
//			tc.setCellValueFactory( new PropertyValueFactory<>("c_name"));
//			
//		// ���̺�信�� Ŭ�������� ������ �������� 
//			// 1. ���̺�信 Ŭ�� �̺�Ʈ 
//			//productlist.setOnMouseClicked( e -> { ���� } );
//			cartable.setOnMouseClicked( e -> { 
//				// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
//				if( e.getButton().equals( MouseButton.PRIMARY ) ) {
//					// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
//					board2 = cartable.getSelectionModel().getSelectedItem();
//					carno2 = CarDao.getCarDao().carno(board2.getC_name());   
//					
//				}
//			} );
//	}
	
	//�ӽ�
	@FXML
    private TableView<?> board3list;

    @FXML
    private Button btnactivation;

    @FXML
    private Button btnboard1;

    @FXML
    private Button btnboard2;

    @FXML
    private Button btnboard3;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnregister;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblrname;

    @FXML
    private ImageView rimg;

    @FXML
    void activation(ActionEvent event) {

    }

    @FXML
    void board1(ActionEvent event) {
    	MainpageController.getinstance().loadpage("board1_list");
    }

    @FXML
    void board2(ActionEvent event) {
    	MainpageController.getinstance().loadpage("board2_list");
    }

    @FXML
    void board3(ActionEvent event) {
    	MainpageController.getinstance().loadpage("board3_list");
    }

    @FXML
    void delete(ActionEvent event) {
    	
    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("board3_write");
    }

    @FXML
    void update(ActionEvent event) {
    	
    }
}
