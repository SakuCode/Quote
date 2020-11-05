package application;
	
import org.json.JSONException;

import com.mashape.unirest.http.exceptions.UnirestException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		//Tries to open mainmenu scene
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/application/MainMenu.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.setTitle("QuoteOfTheDay");
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws UnirestException, JSONException {
		launch(args);
	}
}
