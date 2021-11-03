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

	// ���� (@Override ������ ���� ���������� ��ȯ)�ڡڡڡڡ�
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {



			// ��ȸ�� ���� 21.11.03-2
			BoardDao.getboardDao().viewupdate(board.getB_no() );
		
		txttitle.setText(board.getB_title());
		txtcontents.setText(board.getB_contents());
		
		// 21.11.03-1
		lblwriter.setText("�ۼ��� : " + board.getB_write() );
		lbldate.setText("�ۼ��� : "+ board.getB_date().split(" ")[0] );
		lblview.setText("��ȸ�� : " + board.getB_view() );
		
		
		
		
		if (!MainpageController.getinstance().getloginid()
				.equals(board.getB_write())) {
			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ����
			// ��ư �����
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
		alert.setHeaderText(" �ش� �Խù� �����Ͻðڽ��ϱ�? ");
		alert.setTitle(" �˸� ");
		Optional<ButtonType> optional = alert.showAndWait();
		if ( optional.get() == ButtonType.OK ) {
			// ��������
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
