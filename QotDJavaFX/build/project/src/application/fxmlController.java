package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class fxmlController {
	
    @FXML
   private Button QuoteOfTheDay;
    
    @FXML
   private Button Exit;
    
    @FXML
    private void QuoteOfTheDayOnAction(ActionEvent e) 
    {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/QuotePage.fxml"));
		Parent root;
		try {
			root = (Parent)loader.load();
			QuoteOfTheDay.getScene().setRoot(root);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    }
    
    @FXML
    private void ExitOnAction(ActionEvent e) 
    {
    	System.exit(0);
    }
    

}
