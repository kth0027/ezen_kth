package controller.carcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.CarDao;
import domain.Car;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

//�ӽ�
public class CarinfoController implements Initializable {

	//1. DB���� ��� ��������
	 public void cartableload() {
	
	 }
	 
	//ObservableList<Car> carloads = CarDao.getCarDao().cartableloading();
	
	 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
			ObservableList<Car> carloads = CarDao.getCarDao().cartableloading();
			
			//ImageView[] imageViews = new ImageView[carloads.size()];
			Button[] buttons = new Button[carloads.size()];
			int x = 0;
			int y = 0;
			int xy = 0;
			int xy2 = 0;
			for( int i = 0 ; i<buttons.length ; i++ ) {
				
				// ��ư ũ�� ���� �� ���� 
				buttons[i] = new Button();
				buttons[i].setPrefWidth(300);
				buttons[i].setPrefHeight(300);
				buttons[i].setId("img");
				System.out.println("���� üũ");
				System.out.println(carloads.get(i).getC_img());
				// �̹�����ü�� �̹��� ��� ���� �� �̹������� 
				// �̹��� �並 ���ؼ� �̹��� ���� 
				// ��ư�� �̹��� �� ���� 
					Image image = new Image( carloads.get(i).getC_img());
					ImageView imageView = new ImageView(image);
					imageView.setFitWidth(170);
					imageView.setFitHeight(100);
					
				buttons[i].setGraphic(imageView);
				buttons[i].setMaxSize(170, 100);
				
				// ��ư���� ��ġ ���� 
				xy = 50 + x*200;
				xy2 = 30 + y*150;
				buttons[i].setLayoutX(xy);
				buttons[i].setLayoutY(xy2);
				x++;
				
				// ��ư�� ������ 4�� �� �Ǹ� ���������� �Ѿ 
				if( i % 4 == 3  ) { 
					y++;
					x = 0;  // y ������ �Ѿ�� x�� �ʱ�ȭ �Ǿߵ� 
					buttons[i].setLayoutX(xy);
					buttons[i].setLayoutY(xy2);
				}
				
				
				an.getChildren().add(buttons[i]);
				
			}

	}
	
    @FXML
    private AnchorPane an;

    @FXML
    private ScrollPane sp;



			
		
		


}
