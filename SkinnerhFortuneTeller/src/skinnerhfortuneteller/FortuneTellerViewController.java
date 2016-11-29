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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author HS047694
 */
public class FortuneTellerViewController implements Initializable {
    
    @FXML
    private ImageView fortuneCookieImageView;
    
    @FXML
    private Image fortuneCookieImage;
    
    @FXML
    private TextField output;
    
    @FXML
    public void getFortune() {
        
        output.setText("Insert Fortune Here");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
