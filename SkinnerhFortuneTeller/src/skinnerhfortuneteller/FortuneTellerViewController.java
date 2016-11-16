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

/**
 *
 * @author HS047694
 */
public class FortuneTellerViewController implements Initializable {
    
    String urlString = "https://helloacm.com/api/fortune/";
    
    String response = "";
    
    URL url;
    
    @FXML
    private Button getFortune;
    
    @FXML
    private TextField output;
    
    @FXML
    private void getFortune(ActionEvent event) {
        
        try {
            callAPI();
        } catch (Exception e) {
        }
        
        output.setText(response);
    }
    
    private void callAPI() throws Exception {
        
        try {
            url = new URL(urlString);
            BufferedReader in = new BufferedReader(
            new InputStreamReader(url.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                response += inputLine;
            in.close();
        } catch (Exception ex) {
            throw ex;
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
