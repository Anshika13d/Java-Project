package application;
	
import java.io.File;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;

public class Main extends Application  {
	@Override
	public void start(Stage stage) throws Exception{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("Tinker Maze");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

//		Media media = new Media(new File(path).toURI().toString());  
//		 MediaPlayer mediaPlayer = new MediaPlayer(media);  
//		 mediaPlayer.setAutoPlay(true);  
	       
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
