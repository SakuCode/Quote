package application;

import java.io.IOException;

import org.json.JSONException;

import com.mashape.unirest.http.exceptions.UnirestException;

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
    public Label Quote;
    @FXML
    public Label Author;
    
    @FXML
    public void initialize() throws JSONException, UnirestException
    {
    	QuoteOfTheDay quote = new QuoteOfTheDay();
		Quote.setText(quote.getQuote());
    	Author.setText(quote.getAuthor());
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
