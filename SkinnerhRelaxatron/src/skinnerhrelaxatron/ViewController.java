package skinnerhrelaxatron;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

//Superclass of all viewcontrollers
//Allows Chrome elements (Menu, file open, etc) to stay consistant
// Also allows for simplification & modularization of subclasses
public class ViewController implements Initializable {
    
    @FXML
    private void displayAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Relaxatron");
        alert.setContentText("CS 3330 Final Project developed by Holt Skinner. Inspired by my stressful experience of trying to throw together 3 Final Projects at once.");
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
