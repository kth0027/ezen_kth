package controller.reservationcontroller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.boardcontroller.MainpageController;
import dao.MemberDao;
import dao.CarDao;
import dao.ReservationDao;
import domain.Car;
import domain.Member;
import domain.Reservation;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Window;

public class ReservationpopupController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblselectcar.setText( ReservationController.reservation2.getC_num() + "");
		lblinputdate.setText(ReservationController.reservation2.getR_dayin() + "" );
		lbloutputdate.setText(ReservationController.reservation2.getR_dayout() + "" );
		lbltotdate.setText(ReservationController.reservation2.getR_totday() + "");
		lbltotp.setText(ReservationController.reservation2.getR_totprice() + "");
	}

	@FXML
	private Button btnreservecarck;

	@FXML
	private Label lblinputdate;

	@FXML
	private Label lbloutputdate;

	@FXML
	private Label lblselectcar;

	@FXML
	private Label lbltotdate;

	@FXML
	private Label lbltotp;

	@FXML
	private AnchorPane registercheck;

	@FXML
    void reservecarck(ActionEvent event) {
		ReservationDao.getreservationDao().write(ReservationController.reservation2);
		System.out.println(ReservationController.reservation2.getM_num()+ "???????????");
		System.out.println(ReservationController.reservation2.getC_num()+ "???????????");
		System.out.println(ReservationController.reservation2.getR_totprice().getClass().getName() + "???????????");
		System.out.println(ReservationController.reservation2.getR_totday().getClass().getName() + "???????????");
		System.out.println(ReservationController.reservation2.getR_dayin().getClass().getName() + "???????????");
		System.out.println(ReservationController.reservation2.getR_dayout().getClass().getName() + "???????????");
    	Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setHeaderText(" ?????????? ?????????????");
		Optional<ButtonType> optional = alert.showAndWait();
		
		if (optional.get() == ButtonType.OK) {
			
	   		// ???????? id?? ???????? ???? db????
//    		int m_num = MemberDao.getMemberDao().
//    				mnumcheck( controller.boardcontroller.MainpageController.getinstance().getloginid() );
			
////			// ?????? [ ???? ?????? = 1 ]
//	    	Reservation reservation = new Reservation(int r_num , int m_num , int c_num , String r_dayin , r_dayout , r_plusday , r_totday , r_totprice ); 

			
			
//			// DB????  - 
//	    	boolean result = ReservationDao.getreservationDao().reservecarck( reservation);
	    	
	    	Alert alert2 = new Alert( AlertType.INFORMATION );
	    	
	    	alert2.setHeaderText("???? ???? ????"); alert2.showAndWait();	// ???????? ?????? 
    		MainpageController.getinstance().loadpage("reserve"); // ?????? ????]
    		
    		
    			ReservationController.stage2.close();
    		
    		
    		
//	    	if( result ) {
//	    		alert.setHeaderText("???? ???? ????"); alert.showAndWait();	// ???????? ?????? 
//	    		controller.boardcontroller.MainpageController.getinstance().loadpage("reserve"); // ?????? ???? 
//	    	}
		
			

		}
		
    	

    	
    }

}
