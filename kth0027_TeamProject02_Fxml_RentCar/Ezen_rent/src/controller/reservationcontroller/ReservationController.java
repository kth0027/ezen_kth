package controller.reservationcontroller;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import application.Main;
import controller.boardcontroller.MainpageController;
import dao.MemberDao;
import dao.CarDao;
import dao.ReservationDao;
import domain.Car;
import domain.Reservation;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

public class ReservationController implements Initializable {
	
	boolean flag = false;
	long days;
	int dayss;
	int totdaysp;
	int car_g;
	String st="";
	public static Stage stg;
	public static boolean flagstage;
	public static Car car2 = new Car();
	// ��ϵ� ���� �ҷ�����
	ObservableList<Reservation> rs = FXCollections.observableArrayList(); 
	public void rentcarltableload( ) {

		// 1. DB���� ������� ��������
		if(flag == true) {
			
			
			ObservableList<Car> cars = CarDao.getCarDao().carsearch(car3);
			TableColumn tc = rentcarlist.getColumns().get(0);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_num"));
			tc = rentcarlist.getColumns().get(1);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_name"));
			tc = rentcarlist.getColumns().get(2);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_ct1"));
			tc = rentcarlist.getColumns().get(3);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_ct2"));
			tc = rentcarlist.getColumns().get(4);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_ct3"));
			tc = rentcarlist.getColumns().get(5);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_price"));
			tc = rentcarlist.getColumns().get(6);
			tc.setCellValueFactory(new PropertyValueFactory<>("c_return"));
			
//			boolean ���� = true;
//			boolean ��Ʈ = false;
//			String trueString = Boolean.toString(��Ʈ);
//			String falseString = Boolean.toString(����);

			rentcarlist.setItems(cars);
			flag = false;
			// ���̺�信�� Ŭ�������� ������ ��������
			// 1. ���̺�信 Ŭ�� �̺�Ʈ

			rentcarlist.setOnMouseClicked(e -> {
				// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������
				if (e.getButton().equals(MouseButton.PRIMARY)) {

					// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
					car = rentcarlist.getSelectionModel().getSelectedItem();
					// 4. ���õ� ��ü�� �̹������ ��������
					
					Image image = new Image(CarDao.getCarDao().carlist2(car.getC_num()));
					cimg.setImage(image);

					// 5. �׿�
					lblcname.setText(car.getC_name());

					// ����â
					lblc_num.setText(String.valueOf(car.getC_num()) );
					lblselectcarck.setText(car.getC_name());
					lbldaypck.setText(String.valueOf(car.getC_price()) );

					// �Ѱ���
					
					int days2 = (int)days;
					
					lbltotpck.setText(String.valueOf(car.getC_price() * days2 )  ); 
					totdaysp = car.getC_price() * days2 ;
					car_g = car.getC_num();
				}
			});
		}
		
		
		
		else {
			ObservableList<Car> cars = CarDao.getCarDao().carlist();
		
		
		System.out.println("Ȯ��" + cars);
		// 2. ��ǰ����� ���̺�信 �־��ֱ�
		rentcarlist.setItems(cars);
		// 3. ���̺�信 �� �� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ����
		
		
		TableColumn tc = rentcarlist.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_num"));
		tc = rentcarlist.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_name"));
		tc = rentcarlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_ct1"));
		tc = rentcarlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_ct2"));
		tc = rentcarlist.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_ct3"));
		tc = rentcarlist.getColumns().get(5);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_price"));
		tc = rentcarlist.getColumns().get(6);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_return"));
		
//		boolean ���� = true;
//		boolean ��Ʈ = false;
//		String trueString = Boolean.toString(��Ʈ);
//		String falseString = Boolean.toString(����);

		rentcarlist.setItems(cars);
		
		// ���̺�信�� Ŭ�������� ������ ��������
		// 1. ���̺�信 Ŭ�� �̺�Ʈ

		rentcarlist.setOnMouseClicked(e -> {
			// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������
			if (e.getButton().equals(MouseButton.PRIMARY)) {

				// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
				car = rentcarlist.getSelectionModel().getSelectedItem();

				// 4. ���õ� ��ü�� �̹������ ��������
				Image image = new Image(car.getC_img());
				cimg.setImage(image);

				// 5. �׿�
				lblcname.setText(car.getC_name());

				// ����â
				lblc_num.setText(String.valueOf(car.getC_num()) );
				lblselectcarck.setText(car.getC_name());
				lbldaypck.setText(String.valueOf(car.getC_price()) );

				// �Ѱ���
				
				int days2 = (int)days;
				System.out.println("days" + days);
				System.out.println("days2 ��" + days2);
				lbltotpck.setText(String.valueOf(car.getC_price() * days2 )  ); 
				System.out.println(days);
			
			}
		});
		

		}
		

		


		
	}


	ObservableList<Car> cars = CarDao.getCarDao().carlist();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
			rentcarltableload();
		
		

		c_num.setCellValueFactory(new PropertyValueFactory<>("c_num"));
		c_ct1.setCellValueFactory(new PropertyValueFactory<>("c_ct1"));
		c_ct2.setCellValueFactory(new PropertyValueFactory<>("c_ct2"));
		c_ct3.setCellValueFactory(new PropertyValueFactory<>("c_ct3"));


	}
	



	public static Car car; // ������ ����

	LocalDate rentDate; // �������� ����
	LocalDate returnDate; // �������� ����

//	// �ϼ� * �ϰ��� = ��ü����
//	private void lbltotpck () {
//		String c1;
//		String lbltotdateck = c1;
//		 String.valueOf(car.getC_price()) * lbltotdateck;
//	};

	@FXML
	Button btnreservecarButton;
	Popup popup;
	TextArea textArea;

	@FXML
	private Button btnreservecar;

	@FXML
	private Button btnreturncar;

	@FXML
	private Button btnsearch;

	@FXML
	private TableColumn<?, ?> c_num;

	@FXML
	private TableColumn<Car, String> c_name;

	@FXML
	private TableColumn<Car, String> c_ct1;

	@FXML
	private TableColumn<Car, String> c_ct2;

	@FXML
	private TableColumn<Car, String> c_ct3;

	@FXML
	private TableColumn<?, ?> c_price;

	@FXML
	private TableColumn<?, ?> c_return;

	@FXML
	private ImageView cimg;

	@FXML
	private DatePicker inputdateDatePicker;

	@FXML
	private Button inputdateadd;

	@FXML
	private TextField keyworldTextFilter;

	@FXML
	private Label lblc_num;

	@FXML
	private Label lblcname;

	@FXML
	private Label lblcnum;

	@FXML
	private Label lbldayp;

	@FXML
	private Label lbldaypck;

	@FXML
	private Label lbldaypck1;

	@FXML
	private Label lbldaypck11;

	@FXML
	private Label lblinputdate;

	@FXML
	private TextField lblinputdateck;

	@FXML
	private Label lbloutputdate;

	@FXML
	private TextField lbloutputdateck;

	@FXML
	private Label lblselectcar;

	@FXML
	private Label lblselectcarck;

	@FXML
	private Label lbltotdate;

	@FXML
	private Label lbltotdateck;

	@FXML
	private Label lbltotp;

	@FXML
	private Label lbltotpck;

	@FXML
	private DatePicker outputdateDatePicker;

	@FXML
	private Button outputdateadd;

	@FXML
	private TableView<Car> rentcarlist;
	// ���̺� ���� ��ü�� Ŭ������ : ���׸�

	@FXML
	private TableView<Reservation> reservationlist;

	@FXML
	void inputdateac(ActionEvent event) {

	}
	String rentFormattedDate;
	@FXML
	void inputdateaddac(ActionEvent event) {
		rentDate = inputdateDatePicker.getValue();
		rentFormattedDate = rentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		lblinputdateck.setText(rentFormattedDate);
	}

	@FXML
	void inputdateck(ActionEvent event) {

	}
	String returnFormattedDate;
	@FXML
	void outputdateac(ActionEvent event) {
		returnDate = outputdateDatePicker.getValue();
		returnFormattedDate = returnDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		rentDate = inputdateDatePicker.getValue();
		rentFormattedDate = rentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

		lbloutputdateck.setText(returnFormattedDate);

		// �������� ���� �Ⱓ
		Period period = Period.between(rentDate, returnDate);

		// days ȯ��
		days = ChronoUnit.DAYS.between(rentDate, returnDate);
		System.out.println("check" + days);
		// �ݳ����ڿ� ��Ʈ���ڰ� null���� �ƴϸ�
		if (!lblinputdateck.getText().equals("") && !lbloutputdateck.getText().equals("") ) {
			lbltotdateck.setText(days + "��");
		}
		dayss = (int) days;

		
	}
	
	@FXML
	void outputdateaddac(ActionEvent event) {

	}

	@FXML
	void outputdateck(ActionEvent event) {

	}
	public static ReservationController instance;
	public ReservationController() {
		instance = this;
	}
	
	public static ReservationController getinstance() {
		return instance;
	}
	
	public static Stage stage2;
	// �˾�
	@FXML
	void reservecar(ActionEvent event) {

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/reservepopup.fxml"));
			Parent root1 = (Parent) fxmlLoader.load();
			stage2 = new Stage();
			stage2.setScene(new Scene(root1));
			stage2.setTitle("check info");
			stage2.show();
			flagstage = true;
			
			

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@FXML
	void returncar(ActionEvent event) {

	}
	
	Car car3 = new Car("","","","");
	// ���� ��ȸ��ư �̺�Ʈ
	@FXML
	void search(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setHeaderText(" ������ �˻� �Ͻðڽ��ϱ�?");
		Optional<ButtonType> optional = alert.showAndWait();
		// �� �̸� �Է� �ؽ�Ʈ 
		String cname = keyworldTextFilter.getText();
		String ccategory0 = "";
		String ccategory1 = "";
		String ccategory2 = "";
		
		// �ش� ���� ��ư Ŭ��ȭ�� �� ���� 
			if(opt_1_1.isSelected()) {ccategory0="����";}
			if(opt_1_2.isSelected()) {ccategory0="����";}
			if(opt_1_3.isSelected()) {ccategory0="����";}
			if(opt_1_4.isSelected()) {ccategory0="��Ÿ";}
			
			if(opt_2_1.isSelected()) {ccategory1="����";}
			if(opt_2_2.isSelected()) {ccategory1="����";}
			
			if(opt_3_1.isSelected()) {ccategory2="suv";}
			if(opt_3_2.isSelected()) {ccategory2="����";}
			// �˻� ��ü ���� �޾ƿð��� �����Ƿ� true false�� �з� ���� 
			
			System.out.println("��¥��?" + cname);
			car3 = new Car(cname, ccategory0, ccategory1, ccategory2);
			System.out.println("��¥��??" + car2.getC_name() );
			
			
		if (optional.get() == ButtonType.OK) {
			
			flag = true;
			System.out.println("�÷��� �۵� �Ϸ�");
			System.out.println("dd"+ car3.getC_name());
			initialize(null, null);
			System.out.println("ddd"+ car3.getC_name());
			System.out.println("�̴ϼȶ�����");
			
			
		}
	}
	


	// �ݳ��� - ��Ʈ�� �޼ҵ�
	public void lbltotdateck() {
		String rentFormattedDate = null;
		String returnFormattedDate = null;

		
	}
	
	public static Reservation reservation2;
	//
	@FXML
	void basket(ActionEvent event) {
		//r_num m_num c_license  r_inday r_outday r_totday r_totprice 
		Reservation reservation = new Reservation(1, MemberDao.getMemberDao().getmno(MainpageController.getinstance().getloginid()), 
	            car.getC_num(), rentFormattedDate, returnFormattedDate, Integer.toString(dayss), Integer.toString(totdaysp));
		
		System.out.println(rentFormattedDate + "üũ��");
		rs.add(reservation);
		reservationlist.setItems(rs);
		
		TableColumn tc = reservationlist.getColumns().get(0);
		tc.setCellValueFactory(new PropertyValueFactory<>("r_num"));
		tc = reservationlist.getColumns().get(1);
		tc.setCellValueFactory(new PropertyValueFactory<>("m_num"));
		tc = reservationlist.getColumns().get(2);
		tc.setCellValueFactory(new PropertyValueFactory<>("c_num")); 
		tc = reservationlist.getColumns().get(3);
		tc.setCellValueFactory(new PropertyValueFactory<>("r_dayin"));
		tc = reservationlist.getColumns().get(4);
		tc.setCellValueFactory(new PropertyValueFactory<>("r_dayout"));
		tc = reservationlist.getColumns().get(5);
		tc.setCellValueFactory(new PropertyValueFactory<>("r_totday"));
		tc = reservationlist.getColumns().get(6);
		tc.setCellValueFactory(new PropertyValueFactory<>("r_totprice"));
		
		reservationlist.setOnMouseClicked( e -> { 
			// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
			if( e.getButton().equals( MouseButton.PRIMARY ) ) {
				// 3.���̺�信�� Ŭ���� ���� ������[ ��ü ]
				reservation2 = reservationlist.getSelectionModel().getSelectedItem();
				
				
				
			}
		} );
	}
	

    @FXML
    private Button btnbasket;


    @FXML
    private ToggleGroup category0;

    @FXML
    private ToggleGroup category1;

    @FXML
    private ToggleGroup category2;


    @FXML
    private RadioButton opt_1_1;

    @FXML
    private RadioButton opt_1_2;

    @FXML
    private RadioButton opt_1_3;

    @FXML
    private RadioButton opt_1_4;

    @FXML
    private RadioButton opt_2_1;

    @FXML
    private RadioButton opt_2_2;

    @FXML
    private RadioButton opt_3_1;

    @FXML
    private RadioButton opt_3_2;
    
    @FXML
    private TableColumn<?, ?> r_dayin;

    @FXML
    private TableColumn<?, ?> r_dayout;

    @FXML
    private TableColumn<?, ?> r_num;

    @FXML
    private TableColumn<?, ?> r_totday;

    @FXML
    private TableColumn<?, ?> r_totprice;
    
    @FXML
    private TableColumn<?, ?> m_num;
    
    @FXML
    private TableColumn<?, ?> c_num2;

    

    

}
