package controller;

import java.lang.StackWalker.Option;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoaderviewController implements Initializable {

	// 개별 (@Override 밖으로 빼서 전역변수로 전환)★★★★★
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {



			// 조회수 증가 21.11.03-2
			BoardDao.getboardDao().viewupdate(board.getB_no() );
		
		txttitle.setText(board.getB_title());
		txtcontents.setText(board.getB_contents());
		
		// 21.11.03-1
		lblwriter.setText("작성자 : " + board.getB_write() );
		lbldate.setText("작성일 : "+ board.getB_date().split(" ")[0] );
		lblview.setText("조회수 : " + board.getB_view() );
		
		
		
		
		if (!MainpageController.getinstance().getloginid()
				.equals(board.getB_write())) {
			// 게시물 작성자와 로그인된 아이디가 다를경우
			// 버튼 숨기기
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
		}
	}

	
	@FXML
	private Button btncancel;

	@FXML
	private Button btndelete;

	@FXML
	private Button btnreplywrite;

	@FXML
	private Button btnupdate;

	@FXML
	private TableColumn replylist;

	@FXML
	private TextArea txtcontents;

	@FXML
	private TextField txttitle;

	@FXML
	void cancel(ActionEvent event) {
		MainpageController.getinstance().loadpage("boardlist");
	}

	@FXML // 21.11.03-3
	void delete(ActionEvent event) {
		
		Alert alert = new Alert (AlertType.CONFIRMATION);
		alert.setHeaderText(" 해당 게시물 삭제하시겠습니까? ");
		alert.setTitle(" 알림 ");
		Optional<ButtonType> optional = alert.showAndWait();
		if ( optional.get() == ButtonType.OK ) {
			// 삭제진행
			boolean result = BoardDao.getboardDao().delete(board.getB_no()) ;
			if (result) { MainpageController.getinstance().loadpage("boardlist");}
		}
	}

	@FXML
	void replaywrite(ActionEvent event) {

	}

	@FXML
	void update(ActionEvent event) {

	}

	// 21.11.03-1

    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private Label lblwriter;
}
