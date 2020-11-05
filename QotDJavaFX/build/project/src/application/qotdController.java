package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class qotdController {
	
	QuoteOfTheDay quote;
    @FXML
   private Button BackBtn;
    @FXML
    private Label Quote;
    @FXML
    private Label Author;
    
    
    @FXML
    public void initialize()
    {
    	Quote.setText("quote");
    	Author.setText("Elon Musk");
    	
    }
    
    
    @FXML
    private void BackBtnOnAction(ActionEvent event) {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/cool.fxml"));
		Parent root;
		try {
			root = (Parent)loader.load();
			BackBtn.getScene().setRoot(root);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }

}
