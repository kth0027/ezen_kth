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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.control.Alert.AlertType;

public class Board3_writeController implements Initializable {
	
	int carno2;
	public void reservationboardload() {
		ObservableList<Board> boards = BoardDao.getboardDao().write3(MemberDao.getMemberDao().getmno(MainpageController.getinstance().getloginid()));
		//2. ��ǰ����� ���̺�信 �־��ֱ�
		cartable.setItems(boards);
		//3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
		TableColumn tc = cartable.getColumns().get(0);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_num"));
		tc = cartable.getColumns().get(1);
			tc.setCellValueFactory( new PropertyValueFactory<>("c_name"));
			
		// ���̺�信�� Ŭ�������� ������ �������� 
			// 1. ���̺�信 Ŭ�� �̺�Ʈ 
			//productlist.setOnMouseClicked( e -> { ���� } );
			cartable.setOnMouseClicked( e -> { 
				// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
				if( e.getButton().equals( MouseButton.PRIMARY ) ) {
					// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
					board2 = cartable.getSelectionModel().getSelectedItem();
					carno2 = CarDao.getCarDao().carno(board2.getC_name());   
					
				}
			} );
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		reservationboardload();
		
		
	}
	
	public static Board board2 ;
	
    @FXML
    private TableView<Board> cartable;
    
    @FXML
    private Button btnboard1;

    @FXML
    private Button btnboard2;

    @FXML
    private Button btnboard3;

    @FXML
    private Button btncancel;

    @FXML
    private Button btnwrite1;

    @FXML
    private TextArea txtboard3contents;

    @FXML
    private TextField txtboard3title;

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
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("board3_list");
    }

    @FXML
    void write(ActionEvent event) {
    	// Board(����, ������, ���̵� ���� ��� �ĺ���ȣ, �Խù� ����, �ڵ��� �ĺ���ȣ 
    	Board board = new Board(
    				txtboard3title.getText(),
    				txtboard3contents.getText(),
    				MemberDao.getMemberDao().getmno(MainpageController.getinstance().getloginid()), // �ĺ� ��ȣ ��� 
    				"3", // �Խù� ���� �̿��ı�
    				carno2 // �ڵ��� �ĺ���ȣ 
    			);
    	
    	boolean result = BoardDao.getboardDao().write2(board);
    	
    	
    	Alert alert = new Alert( AlertType.INFORMATION);
    	
    	if( result ) {
    		alert.setHeaderText(" �Խù� ��� ���� ");
    		alert.showAndWait();
    		MainpageController.getinstance().loadpage("board3_list");
    	}else {
    		alert.setHeaderText(" �Խù� ��� ���� [�����ڿ��� ����]");
    		alert.showAndWait();
    	}
    }
}
