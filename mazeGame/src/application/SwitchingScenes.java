package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Circle;
import javafx.scene.media.Media;
import javafx.scene.media.*;
import java.io.File;



public class SwitchingScenes implements Initializable{
	
	private Stage stage1;
	private Scene scene;
	private Parent root;
	
	public void switchToScene1(ActionEvent event) throws IOException {
		 
		Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
		stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage1.setScene(scene);
		stage1.show();
		

	      Image imProfile = new Image(getClass().getResourceAsStream("tinkerwithbee.jpg"));

	      ImageView profileImage=new ImageView(imProfile);
	      


	}
	public void switchToScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage1.setScene(scene);
		stage1.show();
		
		
		  Image x = new Image(getClass().getResourceAsStream("bgt.jpg"));

	      ImageView y=new ImageView(x);
	      
	      Image a = new Image(getClass().getResourceAsStream("treasureimage.jpg"));

	      ImageView b=new ImageView(a);
	      
	      Image z = new Image(getClass().getResourceAsStream("Screenshot 2023-04-30 000838.png"));

	      ImageView c=new ImageView(z);

	}
	
	public void switchToScene3(ActionEvent event) throws IOException {
		 
	  	
		Parent root = FXMLLoader.load(getClass().getResource("Finish.fxml"));
		stage1 = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage1.setScene(scene);
		stage1.show();
		
		
		Image d = new Image(getClass().getResourceAsStream("congrats.png"));

	      ImageView e=new ImageView(d);
	      
	     
	    	
	    	}

	@FXML
	private Circle myCircle;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		myCircle.setCenterY(y-=10);
		//System.out.println("UP");
	}
	public void down(ActionEvent e) {
		//System.out.println("DOWN");
		myCircle.setCenterY(y+=10);

	}
	public void left(ActionEvent e) {
		//System.out.println("LEFT");
		myCircle.setCenterX(x-=10);

	}
	public void right(ActionEvent e) {
		//System.out.println("RIGHT");
		myCircle.setCenterX(x+=10);

}
	
	
	
	
	@FXML
	private ImageView myBackground;
	
	@FXML
	private ImageView myImage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//translate
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myBackground);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
	//	translate.setByX(250);
		translate.setByY(10);
		translate.setAutoReverse(true);
		translate.play();
		
		
	
		

		//translate
		TranslateTransition t = new TranslateTransition();
		translate.setNode(myImage);
		translate.setDuration(Duration.millis(1000));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
	//	translate.setByX(250);
		translate.setByY(10);
		translate.setAutoReverse(true);
		translate.play();
		
		
		
	  	
	}
	
}

