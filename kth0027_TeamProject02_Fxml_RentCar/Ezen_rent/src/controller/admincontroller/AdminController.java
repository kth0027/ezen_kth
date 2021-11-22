package controller.admincontroller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.boardcontroller.MainpageController;
import dao.CarDao;
import dao.MemberDao;
import dao.ReservationDao;
import domain.Car;
import domain.Reservation;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AdminController implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cartableload();
		reservationtableload();
	}
	public static AdminController instance;
	public AdminController() {
		instance = this;
	}
	public static AdminController getinstance() {
		return instance;
	}
	
	//�ӽ�
	@FXML
    private AnchorPane adminpane;
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnenroll;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<Car> carlistboard;

    @FXML
    private TableView<Reservation> reservationboardlist;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("home");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert( AlertType.CONFIRMATION );
    	alert.setHeaderText(" ��ǰ�� ���� �Ͻðڽ��ϱ�?" );
    	Optional<ButtonType> optional = alert.showAndWait();
    	if( optional.get() == ButtonType.OK ) {
    		// DB ó�� 
    		CarDao.getCarDao().delete( AdminController.car.getC_num() );
    		
    		Alert alert2 = new Alert( AlertType.INFORMATION );
    		alert2.setHeaderText(" ���� �Ǿ����ϴ� "); alert2.showAndWait();
    		MainpageController.getinstance().loadpage("admin");
    	}
    }

    @FXML
    void enroll(ActionEvent event) {
    	MainpageController.getinstance().loadpage("admincarenroll");
    	System.out.println("���� ������ �۵�!!");
    }

    @FXML
    void update(ActionEvent event) {
    	MainpageController.getinstance().loadpage("admincarupdate");
    	System.out.println("���� ������ �۵�2!!");
    }
    
    public static Car car;
    
	public void cartableload() {
	    	
    	//1. DB���� ��ǰ��� ��������
				
    			ObservableList<Car> cars = CarDao.getCarDao().carlist();
    			
    			//2. ��ǰ����� ���̺�信 �־��ֱ� 
    			carlistboard.setItems(cars);
    			//3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
    			TableColumn tc = carlistboard.getColumns().get(0);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_num"));
    			tc = carlistboard.getColumns().get(1);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_name"));
    			tc = carlistboard.getColumns().get(2);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_license"));
    			tc = carlistboard.getColumns().get(3);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_ct1"));
    			tc = carlistboard.getColumns().get(4);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_ct2"));
    			tc = carlistboard.getColumns().get(5);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_ct3"));
    			tc = carlistboard.getColumns().get(6);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_return"));
    			tc = carlistboard.getColumns().get(7);
    				tc.setCellValueFactory( new PropertyValueFactory<>("c_price"));
	    				
    				carlistboard.setOnMouseClicked( e -> { 
    					// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
    					if( e.getButton().equals( MouseButton.PRIMARY ) ) {
    						// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
    						car = carlistboard.getSelectionModel().getSelectedItem();
    						System.out.println(car);
    						System.out.println("��ü �������");
    					}
    				} );
	  }
    public static Reservation reservation2;
	public void reservationtableload() {
		System.out.println(ReservationDao.getreservationDao().reservelist());
		
		ObservableList<Reservation> reservations = ReservationDao.getreservationDao().reservelist();
		
		System.out.println("���" );
		//2. ��ǰ����� ���̺�信 �־��ֱ� 
		reservationboardlist.setItems(reservations);
		//3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
		TableColumn tc = reservationboardlist.getColumns().get(0);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_num"));
		tc = reservationboardlist.getColumns().get(1);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_dayin"));
		tc = reservationboardlist.getColumns().get(2);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_dayout"));
		tc = reservationboardlist.getColumns().get(3);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_plusday"));
		tc = reservationboardlist.getColumns().get(4);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_totday"));
		tc = reservationboardlist.getColumns().get(5);
			tc.setCellValueFactory( new PropertyValueFactory<>("r_totprice"));
		tc = reservationboardlist.getColumns().get(6);
			tc.setCellValueFactory( new PropertyValueFactory<>("m_num"));
		tc = reservationboardlist.getColumns().get(7);
			tc.setCellValueFactory( new PropertyValueFactory<>("c_num"));
				
			reservationboardlist.setOnMouseClicked( e -> { 
				// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
				if( e.getButton().equals( MouseButton.PRIMARY ) ) {
					// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
					reservation2 = reservationboardlist.getSelectionModel().getSelectedItem();
					System.out.println(car);
					System.out.println("��ü �������");
				}
			} );
	}
   

}
