package skinnerhfortuneteller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author HS047694
 */
public class FortuneTellerViewController implements Initializable {
    
    @FXML
    private ImageView fortuneCookieImageView;
        
    @FXML
    private Text output;
    
    @FXML
    public void getFortune() {
        
        output.setText("Insert Fortune Here");
    }
    
    @FXML
    private void displayAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("SkinnerhFortuneTeller");
        alert.setContentText("CS 3330 Final Project developed by Holt Skinner.");
        alert.showAndWait();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
