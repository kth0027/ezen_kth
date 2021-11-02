package controller;

import java.net.URL;
import java.util.ResourceBundle;

import domain.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BoaderviewController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		// ����
		Board board = BoardlistController.board;
		txttitle.setText(board.getB_title());
		txtcontents.setText(board.getB_contents());
		if (!MainpageController.getinstance().getloginid().equals(board.getB_write())) {
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

	@FXML
	void delete(ActionEvent event) {

	}

	@FXML
	void replaywrite(ActionEvent event) {

	}

	@FXML
	void update(ActionEvent event) {

	}
}